package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.conscrypt.PSKKeyManager;
import ua.itaysonlab.vkx.R;

/* JADX INFO: renamed from: lِٖٓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C14089l extends AbstractC11801l {

    /* JADX INFO: renamed from: lٌؘ۠, reason: contains not printable characters */
    public final InterfaceC8714l[] f27449l;

    /* JADX INFO: renamed from: lؙۖٛ, reason: contains not printable characters */
    public final AbstractC18082l f27450l;

    /* JADX INFO: renamed from: l٘ٝؖ, reason: contains not printable characters */
    public final InterfaceC8714l[] f27451l;

    public C14089l() {
        super(0);
        this.f27450l = AbstractC0509l.crashlytics(Integer.valueOf(R.string.spark_history_tab_purchase), Integer.valueOf(R.string.spark_history_tab_codes));
        C11507l c11507l = C11507l.f23131l;
        this.f27451l = new InterfaceC8714l[]{AbstractC8020l.smaato(c11507l), AbstractC8020l.smaato(c11507l)};
        Boolean bool = Boolean.TRUE;
        this.f27449l = new InterfaceC8714l[]{AbstractC8020l.smaato(bool), AbstractC8020l.smaato(bool)};
        AbstractC8020l.smaato(Boolean.FALSE);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX INFO: renamed from: public, reason: not valid java name */
    public static final Object m3832public(C14089l c14089l, int i, AbstractC0283l abstractC0283l) throws Throwable {
        C16212l c16212l;
        InterfaceC8714l[] interfaceC8714lArr = c14089l.f27449l;
        InterfaceC8714l[] interfaceC8714lArr2 = c14089l.f27451l;
        if (abstractC0283l instanceof C16212l) {
            c16212l = (C16212l) abstractC0283l;
            int i2 = c16212l.f31723l;
            if ((i2 & RecyclerView.UNDEFINED_DURATION) != 0) {
                c16212l.f31723l = i2 - RecyclerView.UNDEFINED_DURATION;
            } else {
                c16212l = new C16212l(c14089l, abstractC0283l);
            }
        } else {
            c16212l = new C16212l(c14089l, abstractC0283l);
        }
        Object objSmaato = c16212l.f31724l;
        int i3 = c16212l.f31723l;
        int i4 = 20;
        try {
            if (i3 == 0) {
                AbstractC2829l.crashlytics(objSmaato);
                C13568l c13568lM1817l = ((C5501l) ((C5138l) AbstractC16584l.yandex().isPro.f7480l).f11181l).m1817l(new C10111l("/AccountService/QueryBillingHistory", C10036l.f20456l, C10638l.f21586l, 19));
                C10036l c10036l = new C10036l(new C11193l(i4, ((AbstractC18082l) interfaceC8714lArr2[i].getValue()).pro()), i == 1, C3844l.f7950l);
                c16212l.f31725l = i;
                c16212l.f31723l = 1;
                objSmaato = c13568lM1817l.smaato(c10036l, c16212l);
                EnumC9342l enumC9342l = EnumC9342l.f19165l;
                if (objSmaato == enumC9342l) {
                    return enumC9342l;
                }
            } else {
                if (i3 != 1) {
                    C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                i = c16212l.f31725l;
                AbstractC2829l.crashlytics(objSmaato);
            }
            List list = ((C10638l) objSmaato).f21587l;
            InterfaceC8714l interfaceC8714l = interfaceC8714lArr2[i];
            interfaceC8714l.setValue(((AbstractC18082l) interfaceC8714l.getValue()).advert(list));
            interfaceC8714lArr[i].setValue(Boolean.valueOf(list.size() == 20));
        } catch (Exception e) {
            e.printStackTrace();
            interfaceC8714lArr[i].setValue(Boolean.FALSE);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: abstract, reason: not valid java name */
    public final void m3833abstract(C15968l c15968l, InterfaceC17242l interfaceC17242l, C6956l c6956l, int i) {
        c6956l.m2133new(-1340459787);
        int i2 = i | (c6956l.admob(c15968l) ? 4 : 2) | (c6956l.billing(interfaceC17242l) ? 32 : 16) | (c6956l.admob(this) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128);
        if (c6956l.m2127for(i2 & 1, (i2 & 147) != 146)) {
            AbstractC3383l.yandex(interfaceC17242l, new C9946l(3), null, new C7224l(1.0f, 1.0f, 1.0f, 3.0f, 8.0f, 1.0f), null, AbstractC14566l.amazon(1115259239, new C3091l(c15968l, this, 12), c6956l), c6956l, ((i2 >> 3) & 14) | 196608, 20);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C3411l(this, c15968l, interfaceC17242l, i, 9);
        }
    }

    /* JADX INFO: renamed from: import, reason: not valid java name */
    public final void m3834import(C2729l c2729l, InterfaceC17242l interfaceC17242l, C6956l c6956l, int i) {
        c6956l.m2133new(1118243431);
        int i2 = i | (c6956l.admob(c2729l) ? 4 : 2) | (c6956l.billing(interfaceC17242l) ? 32 : 16) | (c6956l.admob(this) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128);
        if (c6956l.m2127for(i2 & 1, (i2 & 147) != 146)) {
            AbstractC3383l.yandex(interfaceC17242l, new C9946l(3), null, null, null, AbstractC14566l.amazon(-1167785383, new C3091l(c2729l, this, 11), c6956l), c6956l, ((i2 >> 3) & 14) | 196608, 28);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C3411l(this, c2729l, interfaceC17242l, i, 8);
        }
    }

    /* JADX INFO: renamed from: instanceof, reason: not valid java name */
    public final void m3835instanceof(EnumC11976l enumC11976l, C6956l c6956l, int i) {
        int i2;
        long j;
        int i3;
        c6956l.m2133new(1020912866);
        int i4 = 4;
        int i5 = 2;
        int i6 = (c6956l.amazon(enumC11976l.ordinal()) ? 4 : 2) | i;
        byte b = 0;
        if (c6956l.m2127for(i6 & 1, (i6 & 3) != 2)) {
            int iOrdinal = enumC11976l.ordinal();
            if (iOrdinal == 0) {
                i2 = R.drawable.ic_clock_28;
            } else if (iOrdinal == 1) {
                i2 = R.drawable.ic_check_circle_outline_24;
            } else if (iOrdinal == 2) {
                i2 = R.drawable.ic_minus_circle_outline_16;
            } else {
                if (iOrdinal != 3) {
                    C18725l.billing();
                    return;
                }
                i2 = R.drawable.history_backward_outline_28;
            }
            int iOrdinal2 = enumC11976l.ordinal();
            if (iOrdinal2 == 0) {
                c6956l.m2123default(1844744395);
                j = ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).yandex.adcel;
                c6956l.startapp(false);
            } else if (iOrdinal2 == 1) {
                c6956l.m2123default(1844751273);
                j = ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).yandex.yandex;
                c6956l.startapp(false);
            } else if (iOrdinal2 == 2) {
                c6956l.m2123default(1844747847);
                j = ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).yandex.pro;
                c6956l.startapp(false);
            } else {
                if (iOrdinal2 != 3) {
                    throw AbstractC12900l.billing(1844741046, c6956l, false);
                }
                c6956l.m2123default(1844754738);
                j = ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).yandex.subscription;
                c6956l.startapp(false);
            }
            int iOrdinal3 = enumC11976l.ordinal();
            if (iOrdinal3 == 0) {
                i3 = R.string.spark_status_created;
            } else if (iOrdinal3 == 1) {
                i3 = R.string.spark_status_complete;
            } else if (iOrdinal3 == 2) {
                i3 = R.string.spark_status_failed;
            } else {
                if (iOrdinal3 != 3) {
                    C18725l.billing();
                    return;
                }
                i3 = R.string.spark_status_refund;
            }
            AbstractC10464l.amazon(j, ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).loadAd.subs, AbstractC14566l.amazon(-1416981238, new C10165l(i2, i3, i5, b), c6956l), c6956l, 384);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C2736l(this, enumC11976l, i, i4);
        }
    }

    @Override // defpackage.AbstractC11801l
    /* JADX INFO: renamed from: new */
    public final void mo271new(C6956l c6956l, int i) {
        c6956l.m2133new(1027376298);
        int i2 = i | (c6956l.admob(this) ? 4 : 2);
        int i3 = 0;
        if (c6956l.m2127for(i2 & 1, (i2 & 3) != 2)) {
            boolean zAdmob = c6956l.admob(this);
            Object objM2132native = c6956l.m2132native();
            int i4 = 13;
            C13863l c13863l = C1867l.yandex;
            if (zAdmob || objM2132native == c13863l) {
                objM2132native = new C5767l(i4, this);
                c6956l.m2147try(objM2132native);
            }
            C2887l c2887lLoadAd = AbstractC10521l.loadAd(0, (Function0) objM2132native, c6956l, 0, 3);
            Object objM2132native2 = c6956l.m2132native();
            if (objM2132native2 == c13863l) {
                objM2132native2 = AbstractC12311l.isPro(c6956l);
                c6956l.m2147try(objM2132native2);
            }
            AbstractC15497l.loadAd(null, AbstractC14566l.amazon(-235994266, new C4585l(c2887lLoadAd, this, (InterfaceC2262l) objM2132native2, i3), c6956l), null, null, null, 0, 0L, 0L, ((C15700l) c6956l.isPro(AbstractC18678l.yandex)).amazon(c6956l), AbstractC14566l.amazon(1573340219, new C3091l(c2887lLoadAd, this, i4), c6956l), c6956l, 805306416, 253);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C2295l(this, i);
        }
    }
}
