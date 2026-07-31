package defpackage;

import android.graphics.drawable.Drawable;
import androidx.recyclerview.widget.RecyclerView;
import bruhcollective.itaysonlab.libvkmusic.methods.uma.GetUserInfo$Preapi;
import bruhcollective.itaysonlab.libvkmusic.objects.UserInfo;
import java.util.List;
import kotlin.Unit;
import org.conscrypt.PSKKeyManager;
import ua.itaysonlab.vkx.R;

/* JADX INFO: renamed from: lؙٕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C6473l extends AbstractC11801l {

    /* JADX INFO: renamed from: lؙۖٛ, reason: contains not printable characters */
    public final C10086l f13517l;

    /* JADX INFO: renamed from: l٘ٝؖ, reason: contains not printable characters */
    public final C10086l f13518l;

    public C6473l() {
        super(0);
        this.f13517l = AbstractC8020l.smaato(C14420l.yandex);
        this.f13518l = AbstractC8020l.smaato(C2580l.f5619l);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: abstract, reason: not valid java name */
    public static final Object m2016abstract(C6473l c6473l, AbstractC0283l abstractC0283l) {
        C9713l c9713l;
        C6473l c6473l2;
        Throwable th;
        Object c4972l;
        if (abstractC0283l instanceof C9713l) {
            c9713l = (C9713l) abstractC0283l;
            int i = c9713l.f19794l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c9713l.f19794l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c9713l = new C9713l(c6473l, abstractC0283l);
            }
        } else {
            c9713l = new C9713l(c6473l, abstractC0283l);
        }
        Object obj = c9713l.f19797l;
        int i2 = c9713l.f19794l;
        if (i2 == 0) {
            AbstractC2829l.crashlytics(obj);
            try {
                c6473l.f13517l.setValue(C2947l.yandex);
                c9713l.f19796l = c6473l;
                c9713l.f19795l = c6473l;
                c9713l.f19794l = 1;
                Object objM2018instanceof = c6473l.m2018instanceof(c9713l);
                EnumC9342l enumC9342l = EnumC9342l.f19165l;
                if (objM2018instanceof == enumC9342l) {
                    return enumC9342l;
                }
                c6473l2 = c6473l;
            } catch (Throwable th2) {
                c6473l2 = c6473l;
                th = th2;
                c4972l = new C4972l(th);
                c6473l = c6473l2;
            }
        } else {
            if (i2 != 1) {
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            c6473l = c9713l.f19795l;
            c6473l2 = c9713l.f19796l;
            try {
                AbstractC2829l.crashlytics(obj);
            } catch (Throwable th3) {
                th = th3;
                c4972l = new C4972l(th);
                c6473l = c6473l2;
            }
        }
        c4972l = C17288l.yandex;
        c6473l.f13517l.setValue(c4972l);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: import, reason: not valid java name */
    public final void m2017import(int i, long j, C6956l c6956l, InterfaceC17242l interfaceC17242l) {
        InterfaceC17242l interfaceC17242l2;
        InterfaceC17242l interfaceC17242l3;
        c6956l.m2133new(312920101);
        int i2 = (c6956l.amazon(R.drawable.ic_hashtag_outline_28) ? 4 : 2) | i | 48 | (c6956l.purchase(j) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128);
        if (c6956l.m2127for(i2 & 1, (i2 & 1171) != 1170)) {
            c6956l.m2141switch();
            int i3 = i & 1;
            C4346l c4346l = C4346l.f8873l;
            if (i3 == 0 || c6956l.ad()) {
                interfaceC17242l3 = c4346l;
            } else {
                c6956l.m2124else();
                interfaceC17242l3 = interfaceC17242l;
            }
            c6956l.adcel();
            InterfaceC17242l interfaceC17242lAmazon = AbstractC4927l.amazon(AbstractC0019l.crashlytics(interfaceC17242l3, AbstractC7497l.yandex), C9735l.loadAd(0.25f, j), AbstractC16837l.yandex);
            InterfaceC10835l interfaceC10835lAmazon = AbstractC9383l.amazon(C18450l.f36026l, false);
            long j2 = c6956l.f14595continue;
            int i4 = (int) (j2 ^ (j2 >>> 32));
            InterfaceC18556l interfaceC18556lSmaato = c6956l.smaato();
            InterfaceC17242l interfaceC17242lBilling = AbstractC17541l.billing(c6956l, interfaceC17242lAmazon);
            InterfaceC8801l.firebase.getClass();
            C16395l c16395l = C3438l.loadAd;
            c6956l.m2140super();
            if (c6956l.f14603switch) {
                c6956l.firebase(c16395l);
            } else {
                c6956l.m2136protected();
            }
            AbstractC8182l.billing(c6956l, interfaceC10835lAmazon, C3438l.mopub);
            AbstractC8182l.billing(c6956l, interfaceC18556lSmaato, C3438l.billing);
            AbstractC8182l.billing(c6956l, Integer.valueOf(i4), C3438l.isPro);
            AbstractC8182l.purchase(c6956l, C3438l.firebase);
            AbstractC8182l.billing(c6956l, interfaceC17242lBilling, C3438l.amazon);
            AbstractC4597l.loadAd(AbstractC16759l.crashlytics(R.drawable.ic_hashtag_outline_28, i2 & 14, c6956l), null, AbstractC0080l.isPro(AbstractC3605l.smaato(c4346l, 8.0f), 24.0f), j, c6956l, 440, 0);
            c6956l.startapp(true);
            interfaceC17242l2 = interfaceC17242l3;
        } else {
            c6956l.m2124else();
            interfaceC17242l2 = interfaceC17242l;
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C2050l(this, interfaceC17242l2, j, i);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: instanceof, reason: not valid java name */
    public final Object m2018instanceof(AbstractC0283l abstractC0283l) {
        C14295l c14295l;
        UserInfo userInfo;
        if (abstractC0283l instanceof C14295l) {
            c14295l = (C14295l) abstractC0283l;
            int i = c14295l.f27975l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c14295l.f27975l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c14295l = new C14295l(this, abstractC0283l);
            }
        } else {
            c14295l = new C14295l(this, abstractC0283l);
        }
        Object objLoadAd = c14295l.f27976l;
        int i2 = c14295l.f27975l;
        List list = null;
        if (i2 == 0) {
            AbstractC2829l.crashlytics(objLoadAd);
            C6841l c6841l = new C6841l();
            c14295l.f27977l = this;
            c14295l.f27975l = 1;
            objLoadAd = c6841l.loadAd(c14295l);
            EnumC9342l enumC9342l = EnumC9342l.f19165l;
            if (objLoadAd == enumC9342l) {
                return enumC9342l;
            }
        } else {
            if (i2 != 1) {
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            this = c14295l.f27977l;
            AbstractC2829l.crashlytics(objLoadAd);
        }
        GetUserInfo$Preapi getUserInfo$Preapi = (GetUserInfo$Preapi) objLoadAd;
        if (getUserInfo$Preapi != null && (userInfo = getUserInfo$Preapi.yandex) != null) {
            list = userInfo.purchase;
        }
        if (list == null) {
            list = C2580l.f5619l;
        }
        this.f13518l.setValue(list);
        return Unit.INSTANCE;
    }

    @Override // defpackage.AbstractC11801l
    /* JADX INFO: renamed from: new */
    public final void mo271new(C6956l c6956l, int i) {
        c6956l.m2133new(-1995513901);
        int i2 = i | (c6956l.admob(this) ? 4 : 2);
        if (c6956l.m2127for(i2 & 1, (i2 & 3) != 2)) {
            C13072l c13072lYandex = AbstractC0831l.yandex(c6956l);
            Object objM2132native = c6956l.m2132native();
            if (objM2132native == C1867l.yandex) {
                objM2132native = AbstractC13273l.loadAd(this.f34617l, R.drawable.placeholder_audio);
                c6956l.m2147try(objM2132native);
            }
            AbstractC7041l.yandex((Drawable) objM2132native, c6956l);
            AbstractC15497l.loadAd(null, AbstractC14566l.amazon(-789341801, new C3666l(c13072lYandex, this, 12), c6956l), null, null, null, 0, 0L, 0L, ((C15700l) c6956l.isPro(AbstractC18678l.yandex)).amazon(c6956l), AbstractC14566l.amazon(1901423138, new C3091l(this, c13072lYandex, 19), c6956l), c6956l, 805306416, 253);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C7668l(this, i);
        }
    }

    @Override // defpackage.AbstractC17777l
    public final void premium() {
        AbstractC10999l.mopub(AbstractC11990l.firebase(this), null, 0, new C11671l(this, null, 6), 3);
    }
}
