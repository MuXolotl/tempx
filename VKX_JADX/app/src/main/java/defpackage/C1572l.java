package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ua.itaysonlab.vkapi2.objects.music.AudioTrack;
import ua.itaysonlab.vkapi2.objects.music.playlist.album.AudioAlbum;
import ua.itaysonlab.vkx.activity.AppActivity;

/* JADX INFO: renamed from: lؓؓۛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C1572l extends AbstractC5563l implements Function2 {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final /* synthetic */ AudioTrack f3891l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ int f3892l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final /* synthetic */ C9879l f3893l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1572l(C9879l c9879l, AudioTrack audioTrack, InterfaceC14029l interfaceC14029l, int i) {
        super(2, interfaceC14029l);
        this.f3892l = i;
        this.f3893l = c9879l;
        this.f3891l = audioTrack;
    }

    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) {
        int i = this.f3892l;
        AudioTrack audioTrack = this.f3891l;
        C9879l c9879l = this.f3893l;
        switch (i) {
            case 0:
                AbstractC2829l.crashlytics(obj);
                AppActivity appActivity = c9879l.yandex;
                List listLoadAd = AbstractC16676l.loadAd(audioTrack);
                List list = listLoadAd.isEmpty() ? null : listLoadAd;
                if (list != null) {
                    AbstractC2044l.yandex(appActivity, list);
                }
                break;
            default:
                AbstractC2829l.crashlytics(obj);
                c9879l.yandex.applovin();
                AppActivity appActivity2 = c9879l.yandex;
                AudioAlbum audioAlbum = audioTrack.vip;
                appActivity2.license(new C17398l(audioAlbum.yandex.intValue(), 8, audioAlbum.loadAd.longValue(), audioAlbum != null ? audioAlbum.crashlytics : null));
                break;
        }
        return Unit.INSTANCE;
    }

    @Override // defpackage.AbstractC12050l
    public final InterfaceC14029l ads(InterfaceC14029l interfaceC14029l, Object obj) {
        int i = this.f3892l;
        AudioTrack audioTrack = this.f3891l;
        C9879l c9879l = this.f3893l;
        switch (i) {
            case 0:
                return new C1572l(c9879l, audioTrack, interfaceC14029l, 0);
            default:
                return new C1572l(c9879l, audioTrack, interfaceC14029l, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC2262l interfaceC2262l = (InterfaceC2262l) obj;
        InterfaceC14029l interfaceC14029l = (InterfaceC14029l) obj2;
        switch (this.f3892l) {
            case 0:
                break;
        }
        return ((C1572l) ads(interfaceC14029l, interfaceC2262l)).Signature(Unit.INSTANCE);
    }
}
