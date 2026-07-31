package defpackage;

import android.util.JsonReader;
import android.util.JsonToken;
import java.io.BufferedReader;
import java.io.IOException;

/* JADX INFO: renamed from: lٕٗٔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C17131l {
    public final long yandex;

    public C17131l(long j) {
        this.yandex = j;
    }

    public static C17131l yandex(BufferedReader bufferedReader) throws IOException {
        JsonReader jsonReader = new JsonReader(bufferedReader);
        try {
            jsonReader.beginObject();
            while (jsonReader.hasNext()) {
                if (jsonReader.nextName().equals("nextRequestWaitMillis")) {
                    if (jsonReader.peek() == JsonToken.STRING) {
                        C17131l c17131l = new C17131l(Long.parseLong(jsonReader.nextString()));
                        jsonReader.close();
                        return c17131l;
                    }
                    C17131l c17131l2 = new C17131l(jsonReader.nextLong());
                    jsonReader.close();
                    return c17131l2;
                }
                jsonReader.skipValue();
            }
            throw new IOException("Response is missing nextRequestWaitMillis field.");
        } catch (Throwable th) {
            jsonReader.close();
            throw th;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof C17131l) && this.yandex == ((C17131l) obj).yandex;
    }

    public final int hashCode() {
        long j = this.yandex;
        return ((int) (j ^ (j >>> 32))) ^ 1000003;
    }

    public final String toString() {
        return AbstractC15560l.ads(this.yandex, "}", new StringBuilder("LogResponse{nextRequestWaitMillis="));
    }
}
