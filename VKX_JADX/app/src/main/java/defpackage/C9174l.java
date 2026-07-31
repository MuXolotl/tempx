package defpackage;

import android.content.Context;
import android.media.AudioManager;
import android.net.Uri;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ua.itaysonlab.vkapi2.objects.music.AudioTrack;
import ua.itaysonlab.vkapi2.objects.music.playlist.album.AudioAlbum;
import ua.itaysonlab.vkapi2.objects.music.playlist.thumb.AlbumThumb;
import ua.itaysonlab.vkx.VKXApplication;

/* JADX INFO: renamed from: lٌۥٟ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C9174l extends AbstractC5097l {

    /* JADX INFO: renamed from: lٌؒٝ, reason: contains not printable characters */
    public static final /* synthetic */ int f18866l = 0;

    /* JADX INFO: renamed from: lؒٝ, reason: contains not printable characters */
    public final C10086l f18867l;

    /* JADX INFO: renamed from: lؔۗؑ, reason: contains not printable characters */
    public final C10086l f18868l;

    /* JADX INFO: renamed from: lؕؒ, reason: contains not printable characters */
    public final C18396l f18869l;

    /* JADX INFO: renamed from: lُؗٝ, reason: contains not printable characters */
    public final C8688l f18870l;

    /* JADX INFO: renamed from: lٌؘ۠, reason: contains not printable characters */
    public final C10086l f18871l;

    /* JADX INFO: renamed from: l٘ٝؖ, reason: contains not printable characters */
    public final C0383l f18872l;

    /* JADX INFO: renamed from: l٘ٞؒ, reason: contains not printable characters */
    public final C14970l f18873l;

    public C9174l(C0383l c0383l) {
        super(false, 3);
        this.f18872l = c0383l;
        this.f18871l = AbstractC8020l.smaato(null);
        this.f18869l = new C18396l(new C1412l(7, this));
        Boolean bool = Boolean.FALSE;
        this.f18868l = AbstractC8020l.smaato(bool);
        this.f18867l = AbstractC8020l.smaato(bool);
        this.f18873l = new C14970l(8, new C5163l(this, null, 0));
        this.f18870l = new C8688l(new C9636l(13, this));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Object pro(C9174l c9174l, AbstractC0283l abstractC0283l) {
        C2969l c2969l;
        C9174l c9174l2;
        C17805l c17805l;
        C0383l c0383l = c9174l.f18872l;
        if (abstractC0283l instanceof C2969l) {
            c2969l = (C2969l) abstractC0283l;
            int i = c2969l.f6454l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c2969l.f6454l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c2969l = new C2969l(c9174l, abstractC0283l);
            }
        } else {
            c2969l = new C2969l(c9174l, abstractC0283l);
        }
        Object objBilling = c2969l.f6455l;
        int i2 = c2969l.f6454l;
        Object obj = null;
        if (i2 == 0) {
            AbstractC2829l.crashlytics(objBilling);
            C7644l c7644lLoadAd = AbstractC16584l.loadAd();
            String str = c0383l.yandex;
            c2969l.f6456l = c9174l;
            c2969l.f6454l = 1;
            C17464l c17464l = new C17464l("audio.getAudioPreviewUrl", C7472l.f15460l);
            c17464l.yandex("audio_id", str);
            c17464l.yandex("preview_type", "longtap");
            objBilling = c7644lLoadAd.billing(c17464l, c2969l);
            EnumC9342l enumC9342l = EnumC9342l.f19165l;
            if (objBilling == enumC9342l) {
                return enumC9342l;
            }
            c9174l2 = c9174l;
        } else {
            if (i2 != 1) {
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            c9174l2 = c2969l.f6456l;
            AbstractC2829l.crashlytics(objBilling);
        }
        C18552l c18552l = (C18552l) AbstractC10802l.isPro((AbstractC14237l) objBilling);
        if (c18552l != null) {
            String str2 = c0383l.yandex;
            String str3 = c18552l.yandex;
            C18396l c18396l = c9174l.f18869l;
            VKXApplication vKXApplication = VKXApplication.f36631l;
            if (vKXApplication == null) {
                vKXApplication = null;
            }
            c18396l.m4530volatile(vKXApplication.getApplicationContext());
            C17804l c17804lAd = c9174l.ad();
            C0935l c0935l = new C0935l();
            C17464l c17464l2 = new C17464l();
            List list = Collections.EMPTY_LIST;
            C13708l c13708l = C13708l.f26763l;
            C2410l c2410l = new C2410l();
            C11470l c11470l = C11470l.amazon;
            Uri uri = str3 == null ? null : Uri.parse(str3);
            AbstractC12442l.subscription(((Uri) c17464l2.purchase) == null || ((UUID) c17464l2.amazon) != null);
            if (uri != null) {
                c17805l = new C17805l(uri, null, ((UUID) c17464l2.amazon) != null ? new C14227l(c17464l2) : null, null, list, null, c13708l, null, -9223372036854775807L);
            } else {
                c17805l = null;
            }
            c17804lAd.mo2776l(new C2427l(str2, new C9202l(c0935l), c17805l, new C7828l(c2410l), C3852l.f7980private, c11470l));
            c9174l.ad().yandex();
            c9174l.ad().mo2753continue(true);
            obj = c18552l;
        }
        c9174l2.f18871l.setValue(obj);
        return Unit.INSTANCE;
    }

    public final C17804l ad() {
        return (C17804l) this.f18870l.getValue();
    }

    @Override // defpackage.AbstractC2338l
    public final void ads() {
        super.ads();
        ad().mo2753continue(true);
        VKXApplication vKXApplication = VKXApplication.f36631l;
        if (vKXApplication == null) {
            vKXApplication = null;
        }
        this.f18869l.m4530volatile(vKXApplication.getApplicationContext());
    }

    @Override // defpackage.AbstractC5097l
    public final void license(C6956l c6956l, int i) {
        c6956l.m2133new(-408907631);
        int i2 = (c6956l.admob(this) ? 4 : 2) | i;
        if (c6956l.m2127for(i2 & 1, (i2 & 3) != 2)) {
            Unit unit = Unit.INSTANCE;
            boolean zAdmob = c6956l.admob(this);
            Object objM2132native = c6956l.m2132native();
            if (zAdmob || objM2132native == C1867l.yandex) {
                objM2132native = new C11039l(this, null, 6);
                c6956l.m2147try(objM2132native);
            }
            AbstractC12311l.amazon(c6956l, unit, (Function2) objM2132native);
            if (((Boolean) this.f18867l.getValue()).booleanValue()) {
                c6956l.m2123default(-1239753333);
                AbstractC11028l.billing(c6956l, 0);
            } else {
                c6956l.m2123default(-1244877199);
            }
            c6956l.startapp(false);
            AbstractC3274l.yandex(null, null, 0L, 0L, 0.0f, 0.0f, null, AbstractC14566l.amazon(-385860372, new C2404l(this), c6956l), c6956l, 12582912, 127);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C2404l(this, i);
        }
    }

    @Override // defpackage.AbstractC2338l
    public final void smaato() {
        super.smaato();
        ad().mo2753continue(false);
        VKXApplication vKXApplication = VKXApplication.f36631l;
        if (vKXApplication == null) {
            vKXApplication = null;
        }
        Context applicationContext = vKXApplication.getApplicationContext();
        C18396l c18396l = this.f18869l;
        c18396l.getClass();
        AbstractC13950l.loadAd((AudioManager) applicationContext.getSystemService("audio"), (C1750l) c18396l.f35933l);
        ad().release();
    }

    @Override // defpackage.AbstractC2338l
    public final void startapp() {
        super.startapp();
        ad().mo2753continue(false);
        VKXApplication vKXApplication = VKXApplication.f36631l;
        if (vKXApplication == null) {
            vKXApplication = null;
        }
        Context applicationContext = vKXApplication.getApplicationContext();
        C18396l c18396l = this.f18869l;
        c18396l.getClass();
        AbstractC13950l.loadAd((AudioManager) applicationContext.getSystemService("audio"), (C1750l) c18396l.f35933l);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C9174l(AudioTrack audioTrack) {
        AlbumThumb albumThumb;
        String strMopub = AbstractC16676l.mopub(audioTrack);
        String str = audioTrack.amazon;
        String str2 = audioTrack.yandex;
        AudioAlbum audioAlbum = audioTrack.vip;
        this(new C0383l(strMopub, str, str2, (audioAlbum == null || (albumThumb = audioAlbum.purchase) == null) ? null : albumThumb.crashlytics, audioTrack.isPro));
    }
}
