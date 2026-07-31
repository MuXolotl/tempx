package defpackage;

import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lّۦؓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C12986l implements Function1 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC16588l f25454l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f25455l;

    public /* synthetic */ C12986l(InterfaceC16588l interfaceC16588l, int i) {
        this.f25455l = i;
        this.f25454l = interfaceC16588l;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.f25455l;
        InterfaceC16588l interfaceC16588l = this.f25454l;
        switch (i) {
            case 0:
                C14378l c14378l = (C14378l) obj;
                if (interfaceC16588l == null) {
                    return null;
                }
                return AbstractC16840l.yandex(C16049l.Companion.serializer(interfaceC16588l), new C16049l(c14378l.loadAd, c14378l.yandex));
            case 1:
                C7695l c7695l = (C7695l) obj;
                if (interfaceC16588l == null) {
                    return null;
                }
                Object objYandex = c7695l.yandex(C16049l.Companion.serializer(interfaceC16588l));
                if (objYandex == null) {
                    C8339l.smaato("Required value was null.");
                    return null;
                }
                C16049l c16049l = (C16049l) objYandex;
                return new C14378l(c16049l.loadAd, c16049l.yandex);
            case 2:
                List list = (List) obj;
                if (interfaceC16588l != null) {
                    return AbstractC16840l.yandex(new C0087l(interfaceC16588l, 0), list);
                }
                return null;
            default:
                C7695l c7695l2 = (C7695l) obj;
                if (interfaceC16588l == null) {
                    return null;
                }
                Object objYandex2 = c7695l2.yandex(new C0087l(interfaceC16588l, 0));
                if (objYandex2 != null) {
                    return (List) objYandex2;
                }
                C8339l.smaato("Required value was null.");
                return null;
        }
    }
}
