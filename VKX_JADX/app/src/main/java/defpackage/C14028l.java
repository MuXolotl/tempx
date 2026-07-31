package defpackage;

import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: renamed from: lٌؙٓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C14028l implements InterfaceC17896l {
    public final C7263l loadAd;
    public final InterfaceC7233l yandex;
    public static final C7842l crashlytics = new C7842l(0);
    public static final C7842l amazon = new C7842l(1);
    public static final C7842l purchase = new C7842l(2);

    public C14028l(InterfaceC7233l interfaceC7233l) {
        C7263l c7263l = new C7263l(interfaceC7233l);
        this.yandex = interfaceC7233l;
        this.loadAd = c7263l;
    }

    public static HashMap amazon(String str) {
        HashMap map = new HashMap();
        map.put("BANDWIDTH", new C14528l(str, 0));
        map.put("AVERAGE-BANDWIDTH", new C14528l(str, 1));
        map.put("CODECS", new C14528l(str, 2));
        map.put("RESOLUTION", new C14528l(str, 3));
        map.put("FRAME-RATE", new C14528l(str, 4));
        map.put("VIDEO", new C14528l(str, 5));
        map.put("PROGRAM-ID", new C15130l());
        return map;
    }

    @Override // defpackage.InterfaceC17896l
    public final void crashlytics(String str, C6344l c6344l) throws C2584l {
        C3930l c3930l = (C3930l) c6344l.f13309l;
        if (c3930l != null) {
            throw C2584l.yandex(this.yandex.loadAd(), 21, null);
        }
        if (c3930l != null) {
            throw new C2584l(21, null);
        }
        if (((C5390l) c6344l.f13307l) == null) {
            C5390l c5390l = new C5390l();
            c5390l.f11542l = new ArrayList();
            c5390l.f11541l = new ArrayList();
            c5390l.f11539l = new ArrayList();
            c6344l.f13307l = c5390l;
        }
        this.loadAd.crashlytics(str, c6344l);
    }
}
