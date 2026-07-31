package defpackage;

import java.util.Map;

/* JADX INFO: renamed from: lْٜؖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C4251l extends C15637l {

    /* JADX INFO: renamed from: native, reason: not valid java name */
    public C17564l f8723native;

    /* JADX INFO: renamed from: volatile, reason: not valid java name */
    public final Map f8724volatile;

    public C4251l(InterfaceC3783l interfaceC3783l, InterfaceC0729l interfaceC0729l, C13281l c13281l, Map map) {
        super(interfaceC3783l, interfaceC0729l, c13281l);
        this.f8724volatile = map;
    }

    @Override // defpackage.C15637l
    public final C5978l metrica(C5978l c5978l) {
        C17564l c17564l;
        C17564l c17564l2 = this.f8723native;
        if (c17564l2 == null) {
            c17564l2 = c5978l.subscription;
        }
        if (c17564l2 != null && (c17564l = (C17564l) this.f8724volatile.get(c17564l2.f34188l)) != null) {
            c17564l2 = c17564l;
        }
        C7417l c7417l = c5978l.smaato;
        C7417l c7417l2 = null;
        if (c7417l == null) {
            c7417l = c7417l2;
        } else {
            InterfaceC1525l[] interfaceC1525lArr = c7417l.yandex;
            int length = interfaceC1525lArr.length;
            int i = 0;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    i2 = -1;
                    break;
                }
                InterfaceC1525l interfaceC1525l = interfaceC1525lArr[i2];
                if ((interfaceC1525l instanceof C1455l) && "com.apple.streaming.transportStreamTimestamp".equals(((C1455l) interfaceC1525l).loadAd)) {
                    break;
                }
                i2++;
            }
            if (i2 != -1) {
                if (length != 1) {
                    InterfaceC1525l[] interfaceC1525lArr2 = new InterfaceC1525l[length - 1];
                    while (i < length) {
                        if (i != i2) {
                            interfaceC1525lArr2[i < i2 ? i : i - 1] = interfaceC1525lArr[i];
                        }
                        i++;
                    }
                    c7417l2 = new C7417l(interfaceC1525lArr2);
                }
                c7417l = c7417l2;
            }
        }
        if (c17564l2 != c5978l.subscription || c7417l != c5978l.smaato) {
            C12984l c12984lYandex = c5978l.yandex();
            c12984lYandex.ads = c17564l2;
            c12984lYandex.firebase = c7417l;
            c5978l = new C5978l(c12984lYandex);
        }
        return super.metrica(c5978l);
    }
}
