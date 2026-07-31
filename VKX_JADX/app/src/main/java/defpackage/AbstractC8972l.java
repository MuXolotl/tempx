package defpackage;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lٌٟۧ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC8972l {
    public final InterfaceC1220l amazon;
    public final Function1 crashlytics;
    public final InterfaceC4539l loadAd;
    public final Function0 yandex;

    public AbstractC8972l(Function0 function0, InterfaceC4539l interfaceC4539l, Function1 function1) {
        this.yandex = function0;
        this.loadAd = interfaceC4539l;
        this.crashlytics = function1;
        final int i = 0;
        this.amazon = AbstractC9968l.crashlytics(3, new Function0(this) { // from class: lٜٓٓ

            /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
            public final /* synthetic */ AbstractC8972l f27632l;

            {
                this.f27632l = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                AbstractC8972l abstractC8972l = this.f27632l;
                switch (i2) {
                    case 0:
                        String strSignatures = abstractC8972l.loadAd.signatures("Content-Disposition");
                        if (strSignatures == null) {
                            return null;
                        }
                        C5705l c5705l = (C5705l) AbstractC16901l.m4214continue(AbstractC9092l.billing(strSignatures));
                        return new C10428l(c5705l.yandex, c5705l.loadAd, false, 11);
                    default:
                        String strSignatures2 = abstractC8972l.loadAd.signatures("Content-Type");
                        if (strSignatures2 == null) {
                            return null;
                        }
                        C5254l c5254l = C5254l.f11335l;
                        return AbstractC10033l.admob(strSignatures2);
                }
            }
        });
        final int i2 = 1;
        AbstractC9968l.crashlytics(3, new Function0(this) { // from class: lٜٓٓ

            /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
            public final /* synthetic */ AbstractC8972l f27632l;

            {
                this.f27632l = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i3 = i2;
                AbstractC8972l abstractC8972l = this.f27632l;
                switch (i3) {
                    case 0:
                        String strSignatures = abstractC8972l.loadAd.signatures("Content-Disposition");
                        if (strSignatures == null) {
                            return null;
                        }
                        C5705l c5705l = (C5705l) AbstractC16901l.m4214continue(AbstractC9092l.billing(strSignatures));
                        return new C10428l(c5705l.yandex, c5705l.loadAd, false, 11);
                    default:
                        String strSignatures2 = abstractC8972l.loadAd.signatures("Content-Type");
                        if (strSignatures2 == null) {
                            return null;
                        }
                        C5254l c5254l = C5254l.f11335l;
                        return AbstractC10033l.admob(strSignatures2);
                }
            }
        });
    }
}
