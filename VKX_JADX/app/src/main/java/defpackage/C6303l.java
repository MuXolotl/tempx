package defpackage;

import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import ua.itaysonlab.vkapi2.objects.music.AudioTrack;
import ua.itaysonlab.vkapi2.objects.music.playlist.album.AudioAlbum;
import ua.itaysonlab.vkapi2.objects.music.playlist.thumb.AlbumThumb;
import ua.itaysonlab.vkx.activity.AppActivity;

/* JADX INFO: renamed from: lؙؙٔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C6303l implements Function0 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C0228l f13258l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f13259l;

    public /* synthetic */ C6303l(C0228l c0228l, int i) {
        this.f13259l = i;
        this.f13258l = c0228l;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        C12787l c12787l;
        int i = this.f13259l;
        InterfaceC14029l interfaceC14029l = null;
        C0228l c0228l = this.f13258l;
        switch (i) {
            case 0:
                InterfaceC13238l<AudioTrack> interfaceC13238lIsVip = c0228l.isVip();
                ArrayList arrayList = new ArrayList(AbstractC14055l.billing(interfaceC13238lIsVip, 10));
                for (AudioTrack audioTrack : interfaceC13238lIsVip) {
                    audioTrack.getClass();
                    String strMopub = AbstractC16676l.mopub(audioTrack);
                    int i2 = audioTrack.loadAd;
                    long j = audioTrack.crashlytics;
                    String str = audioTrack.amazon;
                    String str2 = audioTrack.yandex;
                    AudioAlbum audioAlbum = audioTrack.vip;
                    if (audioAlbum != null) {
                        Integer num = audioAlbum.yandex;
                        int iIntValue = num != null ? num.intValue() : 0;
                        Long l = audioAlbum.loadAd;
                        long jLongValue = l != null ? l.longValue() : 0L;
                        String str3 = audioAlbum.crashlytics;
                        if (str3 == null) {
                            str3 = "";
                        }
                        String str4 = str3;
                        String str5 = audioAlbum.amazon;
                        AlbumThumb albumThumb = audioAlbum.purchase;
                        c12787l = new C12787l(iIntValue, str5, jLongValue, str4, new C8206l(albumThumb != null ? albumThumb.yandex : null, albumThumb != null ? albumThumb.loadAd : null, albumThumb != null ? albumThumb.crashlytics : null, albumThumb != null ? albumThumb.amazon : null, albumThumb != null ? albumThumb.purchase : null));
                    } else {
                        c12787l = null;
                    }
                    arrayList.add(new C7933l(strMopub, new C2757l(str2, i2, j, str, c12787l)));
                }
                new C8583l(arrayList, new C8946l(c0228l, 4)).Signature(c0228l.f5081l);
                break;
            case 1:
                c0228l.f1207l = true;
                c0228l.f1209l = null;
                c0228l.f1208l.setValue(null);
                c0228l.f1200l.setValue(Boolean.FALSE);
                break;
            case 2:
                c0228l.f1201l.setValue(Boolean.FALSE);
                break;
            case 3:
                AbstractC9033l.crashlytics((AppActivity) c0228l.f5081l, new C15417l(c0228l, interfaceC14029l, 3));
                break;
            case 4:
                c0228l.f1201l.setValue(Boolean.FALSE);
                c0228l.purchase();
                break;
            case 5:
                c0228l.f1201l.setValue(Boolean.FALSE);
                break;
            case 6:
                c0228l.purchase();
                break;
            case 7:
                c0228l.f1206l.setValue(Boolean.valueOf(!c0228l.premium()));
                c0228l.advert();
                break;
            default:
                c0228l.f1200l.setValue(Boolean.FALSE);
                break;
        }
        return Unit.INSTANCE;
    }
}
