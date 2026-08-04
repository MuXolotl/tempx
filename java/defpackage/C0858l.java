package defpackage;

import android.app.Activity;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import ua.itaysonlab.vkapi2.objects.music.AudioTrack;
import ua.itaysonlab.vkapi2.objects.music.playlist.album.AudioAlbum;
import ua.itaysonlab.vkapi2.objects.music.playlist.metadata.MainArtist;
import ua.itaysonlab.vkx.R;
import ua.itaysonlab.vkx.VKXApplication;
import ua.itaysonlab.vkx.activity.AppActivity;

/* JADX INFO: renamed from: lؒؗۙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C0858l implements InterfaceC13508l {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final Function0 f2513l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final AudioTrack f2514l;

    public C0858l(AudioTrack audioTrack, Function0 function0) {
        this.f2514l = audioTrack;
        this.f2513l = function0;
    }

    @Override // defpackage.InterfaceC13508l
    public final Object adcel(C8971l c8971l) {
        C7268l.f15111l.getClass();
        return C7268l.crashlytics(this.f2514l, c8971l);
    }

    @Override // defpackage.InterfaceC13508l
    public final List admob() {
        C10227l c10227lAdmob = AbstractC14055l.admob();
        AudioTrack audioTrack = this.f2514l;
        AudioAlbum audioAlbum = audioTrack.vip;
        if (audioAlbum != null) {
            String strLoadAd = audioAlbum.amazon;
            if (AbstractC8576l.yandex(strLoadAd, "unnamed")) {
                strLoadAd = null;
            }
            if (strLoadAd == null) {
                VKXApplication.Companion companion = VKXApplication.f36628l;
                strLoadAd = VKXApplication.Companion.loadAd(R.string.action_audio_toalbum);
            }
            c10227lAdmob.add(new C2900l(R.drawable.ic_vinyl_outline_24, strLoadAd, new C3899l(this, 10)));
        }
        for (MainArtist mainArtist : AbstractC16676l.loadAd(audioTrack)) {
            c10227lAdmob.add(new C2900l(R.drawable.ic_music_mic_outline_28, mainArtist.crashlytics, new C11920l(mainArtist, 1)));
        }
        return AbstractC14055l.purchase(c10227lAdmob);
    }

    @Override // defpackage.InterfaceC13508l
    public final C4587l ads() {
        AudioTrack audioTrack = this.f2514l;
        return new C4587l(audioTrack, audioTrack.amazon, audioTrack.yandex, false);
    }

    @Override // defpackage.InterfaceC13508l
    public final InterfaceC13238l billing() {
        C8195l c8195l;
        C10227l c10227lAdmob = AbstractC14055l.admob();
        int i = 11;
        Function0 function0 = this.f2513l;
        if (function0 != null && (c8195l = (C8195l) function0.invoke()) != null) {
            EnumC12456l enumC12456l = (EnumC12456l) c8195l.f17098l;
            crashlytics(c10227lAdmob, enumC12456l.f24591l, enumC12456l.f24590l, new C15575l(c8195l, this, i));
        }
        crashlytics(c10227lAdmob, R.drawable.ic_list_play_outline_28, R.string.action_audio_playnext, new C3899l(this, i));
        crashlytics(c10227lAdmob, R.drawable.ic_list_play_outline_28, R.string.play_next_to_end, new C3899l(this, 0));
        AudioTrack audioTrack = this.f2514l;
        audioTrack.getClass();
        int i2 = 2;
        if (audioTrack.purchase() != 2) {
            crashlytics(c10227lAdmob, R.drawable.ic_list_add_outline_28, R.string.action_audio_addtoplaylist, new C3899l(this, 1));
            crashlytics(c10227lAdmob, R.drawable.ic_search_outline_28, R.string.action_audio_search, new C3899l(this, i2));
            if (audioTrack.startapp == null) {
                long j = audioTrack.crashlytics;
                C16287l.yandex.getClass();
                if (j == C16287l.crashlytics() && audioTrack.vip == null) {
                    crashlytics(c10227lAdmob, R.drawable.ic_edit_outline_28, R.string.edit_audio, new C3899l(this, 3));
                }
            }
            crashlytics(c10227lAdmob, R.drawable.ic_headphones_outline_28, R.string.action_audio_similar, new C3899l(this, 4));
            crashlytics(c10227lAdmob, R.drawable.speedometer_max_outline_28, R.string.track_bitrate, new C3899l(this, 5));
        }
        crashlytics(c10227lAdmob, R.drawable.ic_article_outline_28, R.string.action_audio_tolyrics, new C3899l(this, 6));
        crashlytics(c10227lAdmob, R.drawable.ic_download_cloud_outline_28, R.string.action_audio_dl, new C3899l(this, 7));
        return AbstractC0509l.purchase(AbstractC14055l.purchase(c10227lAdmob));
    }

    public final void crashlytics(C10227l c10227l, int i, int i2, Function1 function1) {
        c10227l.add(new C15413l(i, i2, false, function1));
    }

    @Override // defpackage.InterfaceC13508l
    public final InterfaceC13238l isPro() {
        C0858l c0858l;
        C10227l c10227lAdmob = AbstractC14055l.admob();
        C7268l.f15111l.getClass();
        if (this.f2514l.pro()) {
            c0858l = this;
            c0858l.subs(c10227lAdmob, R.drawable.ic_download_check_outline_28, R.string.buttonbar_pl_cached, (12 & 4) == 0, false, new C10949l(22));
        } else {
            c0858l = this;
            c0858l.subs(c10227lAdmob, R.drawable.ic_download_outline_28, R.string.buttonbar_pl_cache, (12 & 4) == 0, false, new C3899l(c0858l, 8));
        }
        c0858l.subs(c10227lAdmob, R.drawable.ic_share_outline_28, R.string.share, (12 & 4) == 0, false, new C3899l(c0858l, 9));
        c0858l.subs(c10227lAdmob, R.drawable.ic_radiowaves_left_and_right_outline_28, R.string.uma_radio_title, (12 & 4) == 0, false, new C10949l(23));
        return AbstractC0509l.purchase(AbstractC14055l.purchase(c10227lAdmob));
    }

    @Override // defpackage.InterfaceC13508l
    public final Integer loadAd() {
        return null;
    }

    @Override // defpackage.InterfaceC13508l
    public final void metrica(C4456l c4456l) {
        AudioTrack audioTrack = this.f2514l;
        if (audioTrack.getBilling()) {
            c4456l.m1549synchronized(EnumC16462l.f32181l);
            return;
        }
        AppActivity appActivity = (AppActivity) c4456l.f5081l;
        Integer numValueOf = Integer.valueOf(R.drawable.ic_list_add_outline_28);
        VKXApplication.Companion companion = VKXApplication.f36628l;
        C6666l.yandex(appActivity, new C10734l(numValueOf, VKXApplication.Companion.loadAd(R.string.sn_track_added_to_library), audioTrack.yandex + " - " + audioTrack.amazon, new C8195l(VKXApplication.Companion.loadAd(R.string.sn_undo), new C8810l(11)), new C13932l(9, this), 208));
        c4456l.purchase();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0078, code lost:
    
        if (r6 == r5) goto L32;
     */
    @Override // defpackage.InterfaceC13508l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object purchase(boolean r7, defpackage.AbstractC0283l r8) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.C14043l
            if (r0 == 0) goto L13
            r0 = r8
            lٍٓٙ r0 = (defpackage.C14043l) r0
            int r1 = r0.f27380l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f27380l = r1
            goto L18
        L13:
            lٍٓٙ r0 = new lٍٓٙ
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.f27381l
            int r1 = r0.f27380l
            r2 = 0
            ua.itaysonlab.vkapi2.objects.music.AudioTrack r6 = r6.f2514l
            r3 = 2
            r4 = 1
            lٍؗؐ r5 = defpackage.EnumC9342l.f19165l
            if (r1 == 0) goto L39
            if (r1 == r4) goto L33
            if (r1 != r3) goto L2d
            defpackage.AbstractC2829l.crashlytics(r8)
            goto L7b
        L2d:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.C8339l.smaato(r6)
            return r2
        L33:
            boolean r7 = r0.f27382l
            defpackage.AbstractC2829l.crashlytics(r8)
            goto L59
        L39:
            defpackage.AbstractC2829l.crashlytics(r8)
            if (r7 == 0) goto L59
            r0.f27382l = r7
            r0.f27380l = r4
            lٖۖ r8 = defpackage.AbstractC11463l.yandex
            lؙۙؑ r8 = defpackage.ExecutorC6708l.f14063l
            lًٕٛ r1 = new lًٕٛ
            r4 = 17
            r1.<init>(r6, r2, r4)
            java.lang.Object r8 = defpackage.AbstractC10999l.firebase(r8, r1, r0)
            if (r8 != r5) goto L54
            goto L56
        L54:
            kotlin.Unit r8 = kotlin.Unit.INSTANCE
        L56:
            if (r8 != r5) goto L59
            goto L7a
        L59:
            r0.f27382l = r7
            r0.f27380l = r3
            r6.getClass()
            lٖۖ r7 = defpackage.AbstractC11463l.yandex
            lؙۙؑ r7 = defpackage.ExecutorC6708l.f14063l
            lۗۡ r8 = new lۗۡ
            r1 = 0
            r8.<init>(r1, r6, r2)
            java.lang.Object r6 = defpackage.AbstractC10999l.firebase(r7, r8, r0)
            if (r6 != r5) goto L71
            goto L73
        L71:
            kotlin.Unit r6 = kotlin.Unit.INSTANCE
        L73:
            if (r6 != r5) goto L76
            goto L78
        L76:
            kotlin.Unit r6 = kotlin.Unit.INSTANCE
        L78:
            if (r6 != r5) goto L7b
        L7a:
            return r5
        L7b:
            kotlin.Unit r6 = kotlin.Unit.INSTANCE
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C0858l.purchase(boolean, lّؑۧ):java.lang.Object");
    }

    @Override // defpackage.InterfaceC13508l
    public final void remoteconfig(Activity activity) {
        new C9174l(this.f2514l).Signature(activity);
    }

    @Override // defpackage.InterfaceC13508l
    public final InterfaceC6684l smaato() {
        return new C10975l(28, this.f2514l);
    }

    @Override // defpackage.InterfaceC13508l
    public final Object startapp(C10010l c10010l) throws Throwable {
        C16552l c16552l = AbstractC11463l.yandex;
        Object objFirebase = AbstractC10999l.firebase(ExecutorC6708l.f14063l, new C15556l(this.f2514l, null, 17), c10010l);
        EnumC9342l enumC9342l = EnumC9342l.f19165l;
        if (objFirebase != enumC9342l) {
            objFirebase = Unit.INSTANCE;
        }
        return objFirebase == enumC9342l ? objFirebase : Unit.INSTANCE;
    }

    @Override // defpackage.InterfaceC13508l
    public final void subs(C10227l c10227l, int i, int i2, boolean z, boolean z2, Function1 function1) {
        c10227l.add(new C14843l(i, i2, z, z2, function1));
    }

    @Override // defpackage.InterfaceC13508l
    public final boolean vip() {
        AudioTrack audioTrack = this.f2514l;
        if (audioTrack.vip == null) {
            List list = audioTrack.startapp;
            if (list == null || list.isEmpty()) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.InterfaceC13508l
    public final boolean yandex() {
        return this.f2514l.getBilling();
    }
}
