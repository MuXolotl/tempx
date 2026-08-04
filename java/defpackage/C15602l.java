package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import ua.itaysonlab.catalogkit.objects.Catalog2Response;
import ua.itaysonlab.catalogkit.objects.Catalog2Section;
import ua.itaysonlab.catalogkit.objects.seals.Catalog2Block;
import ua.itaysonlab.vkapi2.objects.music.AudioTrack;
import ua.itaysonlab.vkapi2.objects.users.VKProfile;

/* JADX INFO: renamed from: lُٕؗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C15602l extends AbstractC8284l {
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.AbstractC8284l, defpackage.AbstractC3372l
    /* JADX INFO: renamed from: break */
    public final Object mo850break(int i, InterfaceC14029l interfaceC14029l) {
        C9015l c9015l;
        if (interfaceC14029l instanceof C9015l) {
            c9015l = (C9015l) interfaceC14029l;
            int i2 = c9015l.f18575l;
            if ((i2 & RecyclerView.UNDEFINED_DURATION) != 0) {
                c9015l.f18575l = i2 - RecyclerView.UNDEFINED_DURATION;
            } else {
                c9015l = new C9015l(this, (AbstractC0283l) interfaceC14029l);
            }
        } else {
            c9015l = new C9015l(this, (AbstractC0283l) interfaceC14029l);
        }
        Object objAdmob = c9015l.f18574l;
        int i3 = c9015l.f18575l;
        if (i3 == 0) {
            AbstractC2829l.crashlytics(objAdmob);
            C12772l c12772l = new C12772l("https://vk.com/audio?section=recent", 8);
            c9015l.f18575l = 1;
            objAdmob = AbstractC8189l.admob(c12772l, c9015l);
            EnumC9342l enumC9342l = EnumC9342l.f19165l;
            if (objAdmob == enumC9342l) {
                return enumC9342l;
            }
        } else {
            if (i3 != 1) {
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC2829l.crashlytics(objAdmob);
        }
        Catalog2Response catalog2Response = (Catalog2Response) objAdmob;
        LinkedHashMap linkedHashMapYandex = AbstractC12854l.yandex(catalog2Response.isPro);
        AbstractC12854l.yandex(catalog2Response.firebase);
        AbstractC12854l.yandex(catalog2Response.admob);
        AbstractC12854l.yandex(catalog2Response.mopub);
        AbstractC12854l.yandex(catalog2Response.subs);
        AbstractC12854l.yandex(catalog2Response.remoteconfig);
        AbstractC12854l.yandex(catalog2Response.smaato);
        catalog2Response.yandex();
        AbstractC12854l.yandex(AbstractC12854l.loadAd(catalog2Response.vip));
        List list = catalog2Response.metrica;
        if (list != null) {
            int iFirebase = AbstractC2200l.firebase(AbstractC14055l.billing(list, 10));
            if (iFirebase < 16) {
                iFirebase = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(iFirebase);
            for (Object obj : list) {
                linkedHashMap.put(String.valueOf(((VKProfile) obj).yandex), obj);
            }
            new LinkedHashMap(linkedHashMap);
        } else {
            new LinkedHashMap();
        }
        AbstractC12854l.yandex(catalog2Response.startapp);
        AbstractC12854l.yandex(catalog2Response.adcel);
        AbstractC12854l.yandex(catalog2Response.ads);
        AbstractC12854l.yandex(catalog2Response.subscription);
        AbstractC12854l.yandex(catalog2Response.tapsense);
        AbstractC12854l.yandex(catalog2Response.Signature);
        AbstractC12854l.yandex(catalog2Response.license);
        AbstractC12854l.yandex(catalog2Response.pro);
        AbstractC12854l.yandex(catalog2Response.ad);
        AbstractC12854l.yandex(catalog2Response.advert);
        AbstractC12854l.yandex(catalog2Response.isVip);
        AbstractC12854l.yandex(catalog2Response.signatures);
        AbstractC12854l.yandex(catalog2Response.premium);
        AbstractC12854l.yandex(catalog2Response.applovin);
        AbstractC12854l.yandex(catalog2Response.appmetrica);
        for (Catalog2Block catalog2Block : ((Catalog2Section) AbstractC16901l.m4231native(catalog2Response.yandex.loadAd)).amazon) {
            if (catalog2Block instanceof Catalog2Block.MusicAudiosBlock) {
                List listPurchase = catalog2Block.purchase();
                ArrayList arrayList = new ArrayList();
                Iterator it = listPurchase.iterator();
                while (it.hasNext()) {
                    AudioTrack audioTrack = (AudioTrack) linkedHashMapYandex.get((String) it.next());
                    if (audioTrack != null) {
                        arrayList.add(audioTrack);
                    }
                }
                return arrayList;
            }
        }
        C1759l.firebase("Collection contains no element matching the predicate.");
        return null;
    }

    @Override // defpackage.AbstractC8284l
    /* JADX INFO: renamed from: const */
    public final boolean mo851const() {
        return true;
    }

    @Override // defpackage.AbstractC8284l
    /* JADX INFO: renamed from: implements */
    public final C8195l mo2292implements() {
        return new C8195l(EnumC12456l.f24589l, new C16931l(5, this));
    }
}
