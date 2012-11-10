/*******************************************************************************
 * Copyright 2011 See AUTHORS file.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/

package com.badlogic.gdx.backends.gwt.preloader;

import java.io.IOException;
import java.io.InputStream;

import com.google.gwt.xhr.client.ReadyStateChangeHandler;
import com.google.gwt.xhr.client.XMLHttpRequest;

public class BinaryLoader {
	private final LoaderCallback<Blob> callback;

	public BinaryLoader (String url, LoaderCallback<Blob> callback) {
		this.callback = callback;
		XMLHttpRequest request = XMLHttpRequest.create();
		request.setOnReadyStateChange(new ReadyStateChangeHandler() {
			@Override
			public void onReadyStateChange (XMLHttpRequest xhr) {
				if (xhr.getReadyState() == 4) {
					int status = xhr.getStatus();
					if (status != 200) {
						BinaryLoader.this.callback.error();
					} else {
						BinaryLoader.this.callback.success(new Blob(xhr.getResponseText()));
					}
				}
			}
		});
		overrideMimeType(request, "text/plain; charset=x-user-defined");
		request.open("GET", url);
		request.send();
	}

	private native void overrideMimeType (XMLHttpRequest req, String mimeType) /*-{
																										req.overrideMimeType(mimeType);
																										}-*/;

	public static final class Blob {
		final String data;

		public Blob (String data) {
			this.data = data;
		}

		public int length () {
			return data.length();
		}

		public byte get (int i) {
			return get(data, i);
		}

		private native byte get (String s, int i) /*-{
																var x = s.charCodeAt(i) & 0xff;
																if (x > 127) x -= 256;
																return x;
																}-*/;

		public InputStream read () {
			return new BlobInputStream(this);
		}
	}

	private static class BlobInputStream extends InputStream {
		Blob blob;
		int pos;

		public BlobInputStream (Blob blob) {
			this.blob = blob;
		}

		@Override
		public int read () throws IOException {
			if (pos == blob.length()) return -1;
			return blob.get(pos++) & 0xff;
		}
	}
}