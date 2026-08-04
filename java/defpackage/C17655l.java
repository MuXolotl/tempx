package defpackage;

import java.io.IOException;

/* JADX INFO: renamed from: lٌ٘ؔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public class C17655l extends IOException {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final int f34355l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final boolean f34356l;

    public C17655l(String str, Throwable th, boolean z, int i) {
        super(str, th);
        this.f34356l = z;
        this.f34355l = i;
    }

    public static C17655l crashlytics(String str) {
        return new C17655l(str, null, false, 1);
    }

    public static C17655l loadAd(String str) {
        return new C17655l(str, null, true, 4);
    }

    public static C17655l yandex(RuntimeException runtimeException, String str) {
        return new C17655l(str, runtimeException, true, 1);
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        String message = super.getMessage();
        StringBuilder sb = new StringBuilder();
        sb.append(message != null ? message.concat(" ") : "");
        sb.append("{contentIsMalformed=");
        sb.append(this.f34356l);
        sb.append(", dataType=");
        return AbstractC14814l.remoteconfig(this.f34355l, "}", sb);
    }
}
