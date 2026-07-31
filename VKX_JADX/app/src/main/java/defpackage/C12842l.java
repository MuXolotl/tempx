package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import bruhcollective.itaysonlab.libvkmusic.methods.uma.GetTopTracks$Preapi;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: renamed from: lّۚۖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C12842l extends AbstractC10581l {

    /* JADX INFO: renamed from: lؒٝ, reason: contains not printable characters */
    public final C10086l f25249l = AbstractC8020l.smaato(C4023l.yandex);

    /* JADX INFO: renamed from: l٘ٞؒ, reason: contains not printable characters */
    public final C10086l f25250l = AbstractC8020l.smaato(C2580l.f5619l);

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: public, reason: not valid java name */
    public static final Object m3511public(C12842l c12842l, AbstractC0283l abstractC0283l) {
        C17556l c17556l;
        C12842l c12842l2;
        Throwable th;
        Object c2299l;
        if (abstractC0283l instanceof C17556l) {
            c17556l = (C17556l) abstractC0283l;
            int i = c17556l.f34175l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c17556l.f34175l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c17556l = new C17556l(c12842l, abstractC0283l);
            }
        } else {
            c17556l = new C17556l(c12842l, abstractC0283l);
        }
        Object obj = c17556l.f34178l;
        int i2 = c17556l.f34175l;
        if (i2 == 0) {
            AbstractC2829l.crashlytics(obj);
            try {
                c12842l.f25249l.setValue(C11647l.yandex);
                c17556l.f34177l = c12842l;
                c17556l.f34176l = c12842l;
                c17556l.f34175l = 1;
                Object objM3512finally = c12842l.m3512finally(c17556l);
                EnumC9342l enumC9342l = EnumC9342l.f19165l;
                if (objM3512finally == enumC9342l) {
                    return enumC9342l;
                }
                c12842l2 = c12842l;
            } catch (Throwable th2) {
                c12842l2 = c12842l;
                th = th2;
                c2299l = new C2299l(th);
                c12842l = c12842l2;
            }
        } else {
            if (i2 != 1) {
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            c12842l = c17556l.f34176l;
            c12842l2 = c17556l.f34177l;
            try {
                AbstractC2829l.crashlytics(obj);
            } catch (Throwable th3) {
                th = th3;
                c2299l = new C2299l(th);
                c12842l = c12842l2;
            }
        }
        c2299l = C9873l.yandex;
        c12842l.f25249l.setValue(c2299l);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: finally, reason: not valid java name */
    public final Object m3512finally(AbstractC0283l abstractC0283l) {
        C15946l c15946l;
        if (abstractC0283l instanceof C15946l) {
            c15946l = (C15946l) abstractC0283l;
            int i = c15946l.f31310l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c15946l.f31310l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c15946l = new C15946l(this, abstractC0283l);
            }
        } else {
            c15946l = new C15946l(this, abstractC0283l);
        }
        Object objLoadAd = c15946l.f31311l;
        int i2 = c15946l.f31310l;
        if (i2 == 0) {
            AbstractC2829l.crashlytics(objLoadAd);
            C6841l c6841l = new C6841l(GetTopTracks$Preapi.class, "/user/top/tracks/");
            c15946l.f31312l = this;
            c15946l.f31310l = 1;
            objLoadAd = c6841l.loadAd(c15946l);
            EnumC9342l enumC9342l = EnumC9342l.f19165l;
            if (objLoadAd == enumC9342l) {
                return enumC9342l;
            }
        } else {
            if (i2 != 1) {
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            this = c15946l.f31312l;
            AbstractC2829l.crashlytics(objLoadAd);
        }
        GetTopTracks$Preapi getTopTracks$Preapi = (GetTopTracks$Preapi) objLoadAd;
        List list = getTopTracks$Preapi != null ? getTopTracks$Preapi.yandex : null;
        if (list == null) {
            list = C2580l.f5619l;
        }
        this.f25250l.setValue(list);
        return Unit.INSTANCE;
    }

    @Override // defpackage.AbstractC11801l
    /* JADX INFO: renamed from: new */
    public final void mo271new(C6956l c6956l, int i) {
        c6956l.m2133new(-144408203);
        int i2 = i | (c6956l.admob(this) ? 4 : 2);
        if (c6956l.m2127for(i2 & 1, (i2 & 3) != 2)) {
            C13072l c13072lYandex = AbstractC0831l.yandex(c6956l);
            AbstractC15497l.loadAd(null, AbstractC14566l.amazon(-418465479, new C3666l(c13072lYandex, this, 13), c6956l), null, null, null, 0, 0L, 0L, ((C15700l) c6956l.isPro(AbstractC18678l.yandex)).amazon(c6956l), AbstractC14566l.amazon(-374387644, new C3091l(this, c13072lYandex, 20), c6956l), c6956l, 805306416, 253);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C11408l(this, i);
        }
    }

    @Override // defpackage.AbstractC10581l, defpackage.AbstractC17777l
    public final void premium() {
        super.premium();
        AbstractC10999l.mopub(AbstractC11990l.firebase(this), null, 0, new C11671l(this, null, 7), 3);
    }
}
