package defpackage;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: lؘؔٛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2439l extends AbstractC2398l implements InterfaceC8988l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public boolean f5216l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public C2090l f5217l = C2090l.crashlytics;

    public final void billing(AbstractC2597l abstractC2597l) {
        C16515l c16515l;
        if (!this.f5216l) {
            this.f5217l = this.f5217l.clone();
            this.f5216l = true;
        }
        C2090l c2090l = this.f5217l;
        C2090l c2090l2 = abstractC2597l.f5657l;
        c2090l.getClass();
        int i = 0;
        while (true) {
            int size = c2090l2.yandex.f32283l.size();
            c16515l = c2090l2.yandex;
            if (i >= size) {
                break;
            }
            c2090l.mopub((Map.Entry) c16515l.f32283l.get(i));
            i++;
        }
        Iterator it = c16515l.crashlytics().iterator();
        while (it.hasNext()) {
            c2090l.mopub((Map.Entry) it.next());
        }
    }
}
