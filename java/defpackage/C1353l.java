package defpackage;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lؒۜۡ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C1353l extends AbstractC5563l implements Function2 {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC8714l f3476l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ int f3477l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final /* synthetic */ C0483l f3478l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1353l(C0483l c0483l, InterfaceC8714l interfaceC8714l, InterfaceC14029l interfaceC14029l, int i) {
        super(2, interfaceC14029l);
        this.f3477l = i;
        this.f3478l = c0483l;
        this.f3476l = interfaceC8714l;
    }

    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) {
        int i = this.f3477l;
        C0483l c0483l = this.f3478l;
        InterfaceC8714l interfaceC8714l = this.f3476l;
        switch (i) {
            case 0:
                AbstractC2829l.crashlytics(obj);
                C18572l c18572l = (C18572l) interfaceC8714l.getValue();
                if (c18572l != null) {
                    boolean z = c0483l.yandex.firebase().crashlytics == EnumC11447l.f23032l;
                    C9478l c9478l = c18572l.f36260l;
                    if (c9478l != null && c9478l.amazon != z) {
                        c9478l.amazon = z;
                        if (c9478l.purchase && z) {
                            ((ValueAnimator) c9478l.billing.subs()).resume();
                        }
                    }
                }
                break;
            default:
                AbstractC2829l.crashlytics(obj);
                C18572l c18572l2 = (C18572l) interfaceC8714l.getValue();
                if (c18572l2 != null) {
                    C13450l c13450l = (C13450l) ((C10086l) c0483l.yandex.startapp.f23357l).getValue();
                    Bitmap bitmapLoadAd = c13450l != null ? AbstractC5941l.loadAd(c13450l.loadAd) : null;
                    C9478l c9478l2 = c18572l2.f36260l;
                    if (c9478l2 != null && (bitmapLoadAd == null || c18572l2.f36263l != bitmapLoadAd.hashCode())) {
                        c18572l2.f36263l = bitmapLoadAd == null ? -1 : bitmapLoadAd.hashCode();
                        AbstractC10999l.mopub(AbstractC3891l.loadAd, null, 0, new C7864l(bitmapLoadAd, c9478l2, (InterfaceC14029l) null, 28), 3);
                    }
                }
                break;
        }
        return Unit.INSTANCE;
    }

    @Override // defpackage.AbstractC12050l
    public final InterfaceC14029l ads(InterfaceC14029l interfaceC14029l, Object obj) {
        int i = this.f3477l;
        InterfaceC8714l interfaceC8714l = this.f3476l;
        C0483l c0483l = this.f3478l;
        switch (i) {
            case 0:
                return new C1353l(c0483l, interfaceC8714l, interfaceC14029l, 0);
            default:
                return new C1353l(c0483l, interfaceC8714l, interfaceC14029l, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC2262l interfaceC2262l = (InterfaceC2262l) obj;
        InterfaceC14029l interfaceC14029l = (InterfaceC14029l) obj2;
        switch (this.f3477l) {
            case 0:
                break;
        }
        return ((C1353l) ads(interfaceC14029l, interfaceC2262l)).Signature(Unit.INSTANCE);
    }
}
