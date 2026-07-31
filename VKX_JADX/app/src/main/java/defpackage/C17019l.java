package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: lٍٗ۠, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C17019l extends AbstractC16915l implements Function0 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ C14509l f33159l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ int f33160l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C17019l(C14509l c14509l, int i) {
        super(0);
        this.f33160l = i;
        this.f33159l = c14509l;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        InterfaceC14029l interfaceC14029l;
        Object obj;
        int i = this.f33160l;
        C14509l c14509l = this.f33159l;
        switch (i) {
            case 0:
                boolean z = c14509l.mopub;
                C5616l c5616l = c14509l.billing;
                C14632l c14632l = c14509l.loadAd;
                if (!z && c14632l.loadAd() && c5616l.purchase()) {
                    List listCrashlytics = c14509l.crashlytics();
                    int size = listCrashlytics.size();
                    int i2 = 0;
                    while (true) {
                        interfaceC14029l = null;
                        if (i2 < size) {
                            obj = listCrashlytics.get(i2);
                            if (!((C0633l) obj).amazon().loadAd()) {
                                i2++;
                            }
                        } else {
                            obj = null;
                        }
                    }
                    C0633l c0633l = (C0633l) obj;
                    if (c0633l != null) {
                        InterfaceC17807l interfaceC17807l = c0633l.amazon().billing;
                        if (interfaceC17807l instanceof C13315l) {
                            C13315l c13315l = (C13315l) interfaceC17807l;
                            AbstractC10999l.mopub(c14632l.f28634l, null, 0, new C7226l(c14509l, new C13315l(c13315l.yandex, c13315l.loadAd, new C1187l((((long) Float.floatToRawIntBits(1.0f)) << 32) | (((long) Float.floatToRawIntBits(1.0f)) & 4294967295L))), interfaceC14029l, 26), 3);
                        }
                        c14509l.mopub = true;
                    }
                }
                return new C1187l(((C1187l) c5616l.amazon()).yandex);
            default:
                List listLoadAd = c14509l.loadAd();
                int size2 = listLoadAd.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    C0633l c0633l2 = (C0633l) listLoadAd.get(i3);
                    if (c0633l2.amazon().loadAd() && c0633l2.admob()) {
                        return Unit.INSTANCE;
                    }
                }
                return Unit.INSTANCE;
        }
    }
}
