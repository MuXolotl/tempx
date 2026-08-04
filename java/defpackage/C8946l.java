package defpackage;

import android.net.Uri;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import ua.itaysonlab.vkapi2.objects.music.AudioTrack;
import ua.itaysonlab.vkapi2.objects.music.playlist.album.AudioAlbum;
import ua.itaysonlab.vkapi2.objects.music.playlist.thumb.AlbumThumb;

/* JADX INFO: renamed from: lٌْٞ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C8946l implements Function1 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C0228l f18425l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f18426l;

    public /* synthetic */ C8946l(C0228l c0228l, int i) {
        this.f18426l = i;
        this.f18425l = c0228l;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        AudioAlbum audioAlbum;
        AudioTrack audioTrack;
        String str;
        int i = this.f18426l;
        C0228l c0228l = this.f18425l;
        switch (i) {
            case 0:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                c0228l.f1206l.setValue(bool);
                c0228l.advert();
                return Unit.INSTANCE;
            case 1:
                return C0228l.ad(c0228l, (Uri) obj);
            case 2:
                c0228l.f1203l.setValue((String) obj);
                c0228l.advert();
                return Unit.INSTANCE;
            case 3:
                c0228l.f1211l.setValue((String) obj);
                c0228l.advert();
                return Unit.INSTANCE;
            default:
                List list = (List) obj;
                C12376l c12376l = c0228l.f1205l;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                InterfaceC13238l interfaceC13238lIsVip = c0228l.isVip();
                ArrayList arrayList3 = new ArrayList();
                for (Object obj2 : interfaceC13238lIsVip) {
                    AudioTrack audioTrack2 = (AudioTrack) obj2;
                    if (!list.isEmpty()) {
                        Iterator it = list.iterator();
                        do {
                            if (it.hasNext()) {
                                str = ((C7933l) it.next()).yandex;
                                audioTrack2.getClass();
                            }
                        } while (!str.equals(AbstractC16676l.mopub(audioTrack2)));
                    }
                    arrayList3.add(obj2);
                }
                ArrayList arrayList4 = new ArrayList();
                for (Object obj3 : list) {
                    C7933l c7933l = (C7933l) obj3;
                    InterfaceC13238l interfaceC13238lIsVip2 = c0228l.isVip();
                    if (interfaceC13238lIsVip2 == null || !interfaceC13238lIsVip2.isEmpty()) {
                        Iterator<E> it2 = interfaceC13238lIsVip2.iterator();
                        do {
                            if (it2.hasNext()) {
                                audioTrack = (AudioTrack) it2.next();
                                audioTrack.getClass();
                            }
                        } while (!AbstractC16676l.mopub(audioTrack).equals(c7933l.yandex));
                    }
                    arrayList4.add(obj3);
                }
                Iterator it3 = arrayList3.iterator();
                while (true) {
                    boolean zHasNext = it3.hasNext();
                    EnumC11199l enumC11199l = EnumC11199l.f22550l;
                    EnumC11199l enumC11199l2 = EnumC11199l.f22551l;
                    if (!zHasNext) {
                        Iterator it4 = arrayList4.iterator();
                        while (it4.hasNext()) {
                            C7933l c7933l2 = (C7933l) it4.next();
                            String str2 = c7933l2.yandex;
                            if (c12376l.get(str2) == enumC11199l) {
                                c12376l.put(str2, EnumC11199l.f22554l);
                                it4 = it4;
                            } else {
                                C2757l c2757l = c7933l2.loadAd;
                                int i2 = c2757l.loadAd;
                                long j = c2757l.crashlytics;
                                String str3 = c2757l.amazon;
                                String str4 = c2757l.yandex;
                                C12787l c12787l = c2757l.adcel;
                                if (c12787l != null) {
                                    int i3 = c12787l.yandex;
                                    long j2 = c12787l.crashlytics;
                                    String str5 = c12787l.amazon;
                                    String str6 = c12787l.loadAd;
                                    C8206l c8206l = c12787l.purchase;
                                    audioAlbum = new AudioAlbum(Integer.valueOf(i3), Long.valueOf(j2), str5, str6, new AlbumThumb(c8206l != null ? c8206l.billing : null, c8206l != null ? c8206l.mopub : null, c8206l != null ? c8206l.admob : null, c8206l != null ? c8206l.subs : null, c8206l != null ? c8206l.isPro : null), null, false);
                                } else {
                                    audioAlbum = null;
                                }
                                arrayList.add(new AudioTrack(str4, i2, j, str3, 0, null, false, false, null, null, 0L, null, 0, audioAlbum, null, null, null, null, null, null, false, false, false, false, null, null, 0, null, null, false, false, false, false, false, -8208, 7));
                                c12376l.put(str2, enumC11199l2);
                            }
                            it4 = it4;
                        }
                        List listM4240super = AbstractC16901l.m4240super(arrayList);
                        InterfaceC13238l interfaceC13238lIsVip3 = c0228l.isVip();
                        ArrayList arrayList5 = new ArrayList();
                        for (Object obj4 : interfaceC13238lIsVip3) {
                            AudioTrack audioTrack3 = (AudioTrack) obj4;
                            audioTrack3.getClass();
                            if (!arrayList2.contains(AbstractC16676l.mopub(audioTrack3))) {
                                arrayList5.add(obj4);
                            }
                        }
                        c0228l.f1199l.setValue(AbstractC0509l.purchase(AbstractC16901l.m4232new(listM4240super, arrayList5)));
                        c0228l.advert();
                        return Unit.INSTANCE;
                    }
                    AudioTrack audioTrack4 = (AudioTrack) it3.next();
                    audioTrack4.getClass();
                    String strMopub = AbstractC16676l.mopub(audioTrack4);
                    if (c12376l.get(strMopub) == enumC11199l2) {
                        c12376l.remove(strMopub);
                        arrayList2.add(strMopub);
                    } else {
                        c12376l.put(AbstractC16676l.mopub(audioTrack4), enumC11199l);
                    }
                }
                break;
        }
    }
}
