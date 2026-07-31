package org.chromium.net;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public abstract class ExperimentalUrlRequest extends UrlRequest {

    /* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
    @Deprecated
    public static abstract class Builder extends UrlRequest.Builder {
        public static final int DEFAULT_IDEMPOTENCY = 0;
        public static final int IDEMPOTENT = 1;
        public static final int NOT_IDEMPOTENT = 2;

        @Override // org.chromium.net.UrlRequest.Builder
        public abstract Builder addHeader(String str, String str2);

        @Override // org.chromium.net.UrlRequest.Builder
        public abstract Builder allowDirectExecutor();

        @Override // org.chromium.net.UrlRequest.Builder
        public abstract ExperimentalUrlRequest build();

        @Override // org.chromium.net.UrlRequest.Builder
        public abstract Builder disableCache();

        @Override // org.chromium.net.UrlRequest.Builder
        public abstract Builder setHttpMethod(String str);

        @Override // org.chromium.net.UrlRequest.Builder
        public abstract Builder setPriority(int i);

        @Override // org.chromium.net.UrlRequest.Builder
        public abstract Builder setUploadDataProvider(UploadDataProvider uploadDataProvider, Executor executor);

        @Override // org.chromium.net.UrlRequest.Builder
        public Builder addRequestAnnotation(Object obj) {
            return this;
        }

        @Override // org.chromium.net.UrlRequest.Builder
        public Builder setRequestFinishedListener(RequestFinishedInfo.Listener listener) {
            return this;
        }

        @Override // org.chromium.net.UrlRequest.Builder
        public Builder setTrafficStatsTag(int i) {
            return this;
        }

        @Override // org.chromium.net.UrlRequest.Builder
        public Builder setTrafficStatsUid(int i) {
            return this;
        }

        public Builder disableConnectionMigration() {
            return this;
        }

        public Builder bindToNetwork(long j) {
            return this;
        }

        public Builder setIdempotency(int i) {
            return this;
        }
    }
}
