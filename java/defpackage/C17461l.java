package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ua.itaysonlab.vkapi2.objects.music.playlist.AudioPlaylist;
import ua.itaysonlab.vkx.R;
import ua.itaysonlab.vkx.VKXApplication;
import ua.itaysonlab.vkx.activity.AppActivity;

/* JADX INFO: renamed from: lٗ۠ۤ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C17461l extends AbstractC5563l implements Function2 {

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ C9231l f34019l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final /* synthetic */ AudioPlaylist f34020l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17461l(C9231l c9231l, AudioPlaylist audioPlaylist, InterfaceC14029l interfaceC14029l) {
        super(2, interfaceC14029l);
        this.f34019l = c9231l;
        this.f34020l = audioPlaylist;
    }

    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) {
        AbstractC2829l.crashlytics(obj);
        C9231l c9231l = this.f34019l;
        AppActivity appActivity = (AppActivity) c9231l.f5081l;
        VKXApplication.Companion companion = VKXApplication.f36628l;
        C6666l.yandex(appActivity, new C10734l(new Integer(R.drawable.ic_list_add_outline_28), VKXApplication.Companion.loadAd(R.string.sn_track_added_to_playlist), this.f34020l.mopub, null, null, 248));
        c9231l.purchase();
        return Unit.INSTANCE;
    }

    @Override // defpackage.AbstractC12050l
    public final InterfaceC14029l ads(InterfaceC14029l interfaceC14029l, Object obj) {
        return new C17461l(this.f34019l, this.f34020l, interfaceC14029l);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C17461l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
    }
}
