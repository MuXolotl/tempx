package defpackage;

import android.net.Uri;
import android.os.SystemClock;
import java.util.HashMap;

/* JADX INFO: renamed from: lٕٗۦ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C15741l implements InterfaceC17649l {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ C6827l f30918l;

    public C15741l(C6827l c6827l) {
        this.f30918l = c6827l;
    }

    @Override // defpackage.InterfaceC17649l
    public final boolean loadAd(Uri uri, C14785l c14785l, boolean z) {
        C16293l c16293l;
        C6827l c6827l = this.f30918l;
        HashMap map = c6827l.f14267l;
        if (c6827l.f14263l == null) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            C16293l c16293l2 = (C16293l) map.get(uri);
            c16293l2.getClass();
            C16091l c16091l = c16293l2.yandex;
            int size = c16091l.loadAd.size();
            AbstractC10199l it = AbstractC8481l.ads(c16091l.loadAd.values()).iterator();
            int i = 0;
            while (it.hasNext()) {
                Uri uri2 = (Uri) it.next();
                C16293l c16293l3 = (C16293l) map.get(uri2);
                if (c16293l3 != null) {
                    C16456l c16456l = (C16456l) AbstractC2812l.adcel(c16293l3.loadAd, uri2, uri2);
                    c16456l.getClass();
                    if (jElapsedRealtime <= c16456l.f32174l) {
                        i++;
                    }
                }
            }
            int size2 = c6827l.f14268l.size();
            C9258l c9258lListIterator = c6827l.f14268l.listIterator(0);
            int i2 = 0;
            while (c9258lListIterator.hasNext()) {
                if (c6827l.mopub((C16091l) c9258lListIterator.next(), jElapsedRealtime)) {
                    i2++;
                }
            }
            C8128l c8128lSignature = c6827l.f14256l.Signature(new C13531l(size, i, size2, i2), c14785l);
            if (c8128lSignature != null && (c16293l = (C16293l) map.get(uri)) != null) {
                return C16293l.crashlytics(c16293l, uri, c8128lSignature.f16931l);
            }
        }
        return false;
    }

    @Override // defpackage.InterfaceC17649l
    public final void yandex() {
        this.f30918l.f14266l.remove(this);
    }
}
