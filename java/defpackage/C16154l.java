package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: lٖؓ۟, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C16154l implements Function0 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC2262l f31647l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC13264l f31648l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f31649l;

    public /* synthetic */ C16154l(InterfaceC2262l interfaceC2262l, AbstractC13264l abstractC13264l, int i) {
        this.f31649l = i;
        this.f31647l = interfaceC2262l;
        this.f31648l = abstractC13264l;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.f31649l;
        boolean z = true;
        AbstractC13264l abstractC13264l = this.f31648l;
        InterfaceC2262l interfaceC2262l = this.f31647l;
        switch (i) {
            case 0:
                if (abstractC13264l.crashlytics()) {
                    AbstractC10999l.mopub(interfaceC2262l, null, 0, new C16501l(0, null, abstractC13264l), 3);
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 1:
                if (abstractC13264l.amazon()) {
                    AbstractC10999l.mopub(interfaceC2262l, null, 0, new C16501l(1, null, abstractC13264l), 3);
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 2:
                if (abstractC13264l.crashlytics()) {
                    AbstractC10999l.mopub(interfaceC2262l, null, 0, new C16501l(0, null, abstractC13264l), 3);
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 3:
                if (abstractC13264l.amazon()) {
                    AbstractC10999l.mopub(interfaceC2262l, null, 0, new C16501l(1, null, abstractC13264l), 3);
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 4:
                AbstractC10999l.mopub(interfaceC2262l, null, 0, new C16501l(4, null, abstractC13264l), 3);
                return Unit.INSTANCE;
            case 5:
                AbstractC10999l.mopub(interfaceC2262l, null, 0, new C16501l(5, null, abstractC13264l), 3);
                return Unit.INSTANCE;
            default:
                AbstractC10999l.mopub(interfaceC2262l, null, 0, new C16501l(3, null, abstractC13264l), 3);
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ C16154l(AbstractC13264l abstractC13264l, InterfaceC2262l interfaceC2262l, int i) {
        this.f31649l = i;
        this.f31648l = abstractC13264l;
        this.f31647l = interfaceC2262l;
    }
}
