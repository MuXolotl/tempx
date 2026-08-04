package defpackage;

import android.graphics.drawable.Drawable;
import androidx.recyclerview.widget.RecyclerView;
import bruhcollective.itaysonlab.libvkmusic.methods.uma.GetTopArtists$Preapi;
import java.util.List;
import kotlin.Unit;
import ua.itaysonlab.vkx.R;

/* JADX INFO: renamed from: lؑؖٝ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C0113l extends AbstractC11801l {

    /* JADX INFO: renamed from: lؙۖٛ, reason: contains not printable characters */
    public final C10086l f1018l;

    /* JADX INFO: renamed from: l٘ٝؖ, reason: contains not printable characters */
    public final C10086l f1019l;

    public C0113l() {
        super(0);
        this.f1018l = AbstractC8020l.smaato(C18157l.yandex);
        this.f1019l = AbstractC8020l.smaato(C2580l.f5619l);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: import, reason: not valid java name */
    public static final Object m275import(C0113l c0113l, AbstractC0283l abstractC0283l) {
        C12991l c12991l;
        C0113l c0113l2;
        Throwable th;
        Object c16261l;
        if (abstractC0283l instanceof C12991l) {
            c12991l = (C12991l) abstractC0283l;
            int i = c12991l.f25458l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c12991l.f25458l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c12991l = new C12991l(c0113l, abstractC0283l);
            }
        } else {
            c12991l = new C12991l(c0113l, abstractC0283l);
        }
        Object obj = c12991l.f25461l;
        int i2 = c12991l.f25458l;
        if (i2 == 0) {
            AbstractC2829l.crashlytics(obj);
            try {
                c0113l.f1018l.setValue(C17733l.yandex);
                c12991l.f25460l = c0113l;
                c12991l.f25459l = c0113l;
                c12991l.f25458l = 1;
                Object objM276abstract = c0113l.m276abstract(c12991l);
                EnumC9342l enumC9342l = EnumC9342l.f19165l;
                if (objM276abstract == enumC9342l) {
                    return enumC9342l;
                }
                c0113l2 = c0113l;
            } catch (Throwable th2) {
                c0113l2 = c0113l;
                th = th2;
                c16261l = new C16261l(th);
                c0113l = c0113l2;
            }
        } else {
            if (i2 != 1) {
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            c0113l = c12991l.f25459l;
            c0113l2 = c12991l.f25460l;
            try {
                AbstractC2829l.crashlytics(obj);
            } catch (Throwable th3) {
                th = th3;
                c16261l = new C16261l(th);
                c0113l = c0113l2;
            }
        }
        c16261l = C4706l.yandex;
        c0113l.f1018l.setValue(c16261l);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: abstract, reason: not valid java name */
    public final Object m276abstract(AbstractC0283l abstractC0283l) {
        C0077l c0077l;
        if (abstractC0283l instanceof C0077l) {
            c0077l = (C0077l) abstractC0283l;
            int i = c0077l.f981l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c0077l.f981l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c0077l = new C0077l(this, abstractC0283l);
            }
        } else {
            c0077l = new C0077l(this, abstractC0283l);
        }
        Object objLoadAd = c0077l.f982l;
        int i2 = c0077l.f981l;
        if (i2 == 0) {
            AbstractC2829l.crashlytics(objLoadAd);
            C6841l c6841l = new C6841l(GetTopArtists$Preapi.class, "/user/top/artists/");
            c0077l.f983l = this;
            c0077l.f981l = 1;
            objLoadAd = c6841l.loadAd(c0077l);
            EnumC9342l enumC9342l = EnumC9342l.f19165l;
            if (objLoadAd == enumC9342l) {
                return enumC9342l;
            }
        } else {
            if (i2 != 1) {
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            this = c0077l.f983l;
            AbstractC2829l.crashlytics(objLoadAd);
        }
        GetTopArtists$Preapi getTopArtists$Preapi = (GetTopArtists$Preapi) objLoadAd;
        List list = getTopArtists$Preapi != null ? getTopArtists$Preapi.yandex : null;
        if (list == null) {
            list = C2580l.f5619l;
        }
        this.f1019l.setValue(list);
        return Unit.INSTANCE;
    }

    @Override // defpackage.AbstractC11801l
    /* JADX INFO: renamed from: new */
    public final void mo271new(C6956l c6956l, int i) {
        c6956l.m2133new(1428559753);
        int i2 = i | (c6956l.admob(this) ? 4 : 2);
        if (c6956l.m2127for(i2 & 1, (i2 & 3) != 2)) {
            C13072l c13072lYandex = AbstractC0831l.yandex(c6956l);
            Object objM2132native = c6956l.m2132native();
            if (objM2132native == C1867l.yandex) {
                objM2132native = AbstractC13273l.loadAd(this.f34617l, R.drawable.placeholder_audio);
                c6956l.m2147try(objM2132native);
            }
            AbstractC15497l.loadAd(null, AbstractC14566l.amazon(52522573, new C3666l(c13072lYandex, this, 11), c6956l), null, null, null, 0, 0L, 0L, ((C15700l) c6956l.isPro(AbstractC18678l.yandex)).amazon(c6956l), AbstractC14566l.amazon(-538350952, new C15272l(this, c13072lYandex, AbstractC7041l.yandex((Drawable) objM2132native, c6956l)), c6956l), c6956l, 805306416, 253);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C2015l(this, i);
        }
    }

    @Override // defpackage.AbstractC17777l
    public final void premium() {
        AbstractC10999l.mopub(AbstractC11990l.firebase(this), null, 0, new C11671l(this, null, 5), 3);
    }
}
