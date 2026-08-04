package defpackage;

import android.app.Activity;
import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import ua.itaysonlab.vkapi2.objects.music.playlist.AudioPlaylist;
import ua.itaysonlab.vkapi2.objects.music.playlist.AudioPlaylistPermissions;
import ua.itaysonlab.vkapi2.objects.music.playlist.metadata.MainArtist;
import ua.itaysonlab.vkx.R;
import ua.itaysonlab.vkx.VKXApplication;
import ua.itaysonlab.vkx.activity.AppActivity;

/* JADX INFO: renamed from: lۣؗۡ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C5218l implements InterfaceC13508l {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final String f11301l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final AudioPlaylist f11302l;

    public C5218l(AudioPlaylist audioPlaylist, String str) {
        this.f11302l = audioPlaylist;
        this.f11301l = str;
    }

    @Override // defpackage.InterfaceC13508l
    public final Object adcel(C8971l c8971l) {
        C7268l.f15111l.getClass();
        C16552l c16552l = AbstractC11463l.yandex;
        return AbstractC10999l.firebase(ExecutorC6708l.f14063l, new C10118l(this.f11302l, null), c8971l);
    }

    @Override // defpackage.InterfaceC13508l
    public final List admob() {
        AudioPlaylist audioPlaylist = this.f11302l;
        if (!AbstractC14770l.billing(audioPlaylist)) {
            if (AbstractC14770l.admob(audioPlaylist)) {
                return C2580l.f5619l;
            }
            return Collections.singletonList(new C2900l(R.drawable.ic_profile_28, this.f11301l, new C0409l(this, 4)));
        }
        List<MainArtist> list = audioPlaylist.isVip;
        ArrayList arrayList = new ArrayList(AbstractC14055l.billing(list, 10));
        for (MainArtist mainArtist : list) {
            arrayList.add(new C2900l(R.drawable.ic_music_mic_outline_28, mainArtist.crashlytics, new C11920l(mainArtist, 0)));
        }
        return arrayList;
    }

    @Override // defpackage.InterfaceC13508l
    public final C4587l ads() {
        AudioPlaylist audioPlaylist = this.f11302l;
        return new C4587l(audioPlaylist, audioPlaylist.mopub, this.f11301l, false);
    }

    public final void amazon(C10227l c10227l, int i, int i2, Function1 function1) {
        c10227l.add(new C15413l(i, i2, false, function1));
    }

    @Override // defpackage.InterfaceC13508l
    public final InterfaceC13238l billing() {
        C10227l c10227lAdmob = AbstractC14055l.admob();
        amazon(c10227lAdmob, R.drawable.ic_list_play_outline_28, R.string.action_audio_playnext, new C0409l(this, 7));
        amazon(c10227lAdmob, R.drawable.ic_list_play_outline_28, R.string.play_next_to_end, new C0409l(this, 8));
        amazon(c10227lAdmob, R.drawable.ic_list_add_outline_28, R.string.merge_playlist, new C0409l(this, 9));
        AudioPlaylist audioPlaylist = this.f11302l;
        AudioPlaylistPermissions audioPlaylistPermissions = audioPlaylist.f36623throws;
        int i = 1;
        if (audioPlaylistPermissions != null && audioPlaylistPermissions.amazon) {
            amazon(c10227lAdmob, R.drawable.ic_edit_outline_28, R.string.edit_playlist, new C0409l(this, 10));
        }
        AudioPlaylistPermissions audioPlaylistPermissions2 = audioPlaylist.f36623throws;
        if (audioPlaylistPermissions2 != null && audioPlaylistPermissions2.yandex) {
            amazon(c10227lAdmob, R.drawable.ic_copy_outline_28, R.string.action_copy_playlist, new C0409l(this, 0));
        }
        if (AbstractC14770l.admob(audioPlaylist)) {
            c10227lAdmob.add(new C15413l(R.drawable.ic_search_outline_28, R.string.find_duplicates, true, new C0409l(this, i)));
        }
        c10227lAdmob.add(new C15413l(R.drawable.ic_arrow_pop_up_outline_28, R.string.libtools_merge_playlist, true, new C0409l(this, 2)));
        amazon(c10227lAdmob, R.drawable.ic_download_cloud_outline_28, R.string.action_audio_dl, new C0409l(this, 3));
        return AbstractC0509l.billing(AbstractC14055l.purchase(c10227lAdmob));
    }

    public final void crashlytics(Context context, Function1 function1) {
        AbstractC9033l.crashlytics((AppActivity) context, new C0932l(function1, this, null, 8));
    }

    @Override // defpackage.InterfaceC13508l
    public final InterfaceC13238l isPro() {
        C5218l c5218l;
        C10227l c10227lAdmob = AbstractC14055l.admob();
        C7268l.f15111l.getClass();
        if (C7268l.amazon(this.f11302l)) {
            c5218l = this;
            c5218l.subs(c10227lAdmob, R.drawable.ic_download_check_outline_28, R.string.buttonbar_pl_cached, (12 & 4) == 0, false, new C10949l(20));
        } else {
            c5218l = this;
            c5218l.subs(c10227lAdmob, R.drawable.ic_download_outline_28, R.string.buttonbar_pl_cache, (12 & 4) == 0, false, new C0409l(c5218l, 5));
        }
        c5218l.subs(c10227lAdmob, R.drawable.ic_share_outline_28, R.string.share, (12 & 4) == 0, false, new C0409l(c5218l, 6));
        c5218l.subs(c10227lAdmob, R.drawable.ic_radiowaves_left_and_right_outline_28, R.string.uma_radio_title, (12 & 4) == 0, false, new C10949l(21));
        return AbstractC0509l.purchase(AbstractC14055l.purchase(c10227lAdmob));
    }

    @Override // defpackage.InterfaceC13508l
    public final Integer loadAd() {
        if (AbstractC14770l.admob(this.f11302l)) {
            return Integer.valueOf(R.drawable.ic_delete_outline_android_28);
        }
        return null;
    }

    @Override // defpackage.InterfaceC13508l
    public final void metrica(C4456l c4456l) {
        AudioPlaylist audioPlaylist = this.f11302l;
        if (AbstractC14770l.subs(audioPlaylist)) {
            c4456l.m1549synchronized(EnumC16462l.f32181l);
            return;
        }
        AppActivity appActivity = (AppActivity) c4456l.f5081l;
        VKXApplication.Companion companion = VKXApplication.f36628l;
        C6666l.yandex(appActivity, new C10734l(Integer.valueOf(R.drawable.ic_list_add_outline_28), VKXApplication.Companion.loadAd(R.string.sn_playlist_added_to_library), audioPlaylist.mopub, new C8195l(VKXApplication.Companion.loadAd(R.string.sn_undo), new C8810l(10)), new C13932l(7, this), 208));
        c4456l.purchase();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.InterfaceC13508l
    public final Object purchase(boolean z, AbstractC0283l abstractC0283l) throws Throwable {
        C1580l c1580l;
        if (abstractC0283l instanceof C1580l) {
            c1580l = (C1580l) abstractC0283l;
            int i = c1580l.f3905l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c1580l.f3905l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c1580l = new C1580l(this, abstractC0283l);
            }
        } else {
            c1580l = new C1580l(this, abstractC0283l);
        }
        Object obj = c1580l.f3904l;
        int i2 = c1580l.f3905l;
        AudioPlaylist audioPlaylist = this.f11302l;
        if (i2 == 0) {
            AbstractC2829l.crashlytics(obj);
            if (z) {
                int i3 = audioPlaylist.crashlytics;
                long j = audioPlaylist.amazon;
                c1580l.f3905l = 1;
                C16552l c16552l = AbstractC11463l.yandex;
                Object objFirebase = AbstractC10999l.firebase(ExecutorC6708l.f14063l, new C9718l(i3, j, null), c1580l);
                Object obj2 = EnumC9342l.f19165l;
                if (objFirebase != obj2) {
                    objFirebase = Unit.INSTANCE;
                }
                if (objFirebase == obj2) {
                    return obj2;
                }
            }
        } else {
            if (i2 != 1) {
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC2829l.crashlytics(obj);
        }
        AbstractC8189l.purchase(new C16534l(audioPlaylist, 2));
        return Unit.INSTANCE;
    }

    @Override // defpackage.InterfaceC13508l
    public final InterfaceC6684l smaato() {
        AudioPlaylist audioPlaylist = this.f11302l;
        if (AbstractC14770l.mopub(audioPlaylist)) {
            return new C13161l(audioPlaylist);
        }
        return null;
    }

    @Override // defpackage.InterfaceC13508l
    public final Object startapp(C10010l c10010l) throws Throwable {
        AudioPlaylist audioPlaylist = this.f11302l;
        int i = audioPlaylist.crashlytics;
        long j = audioPlaylist.amazon;
        C16552l c16552l = AbstractC11463l.yandex;
        Object objFirebase = AbstractC10999l.firebase(ExecutorC6708l.f14063l, new C9718l(i, j, null), c10010l);
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
        AudioPlaylist audioPlaylist = this.f11302l;
        return AbstractC14770l.billing(audioPlaylist) || !AbstractC14770l.admob(audioPlaylist);
    }

    @Override // defpackage.InterfaceC13508l
    public final boolean yandex() {
        return AbstractC14770l.subs(this.f11302l);
    }

    @Override // defpackage.InterfaceC13508l
    public final void remoteconfig(Activity activity) {
    }
}
