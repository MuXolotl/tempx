package defpackage;

import android.net.Uri;
import java.io.IOException;
import java.util.Map;

/* JADX INFO: renamed from: lؙؕٚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C3240l extends IOException {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final Map f6930l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final Uri f6931l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final C2432l f6932l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final long f6933l;

    public C3240l(C2432l c2432l, Uri uri, Map map, long j, Exception exc) {
        super(exc);
        this.f6932l = c2432l;
        this.f6931l = uri;
        this.f6930l = map;
        this.f6933l = j;
    }
}
