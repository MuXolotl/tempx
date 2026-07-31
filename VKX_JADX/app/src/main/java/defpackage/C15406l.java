package defpackage;

import android.app.Activity;
import android.net.Uri;
import android.util.Log;
import androidx.car.app.navigation.model.Maneuver;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import ua.itaysonlab.vkx.R;
import ua.itaysonlab.vkx.VKXApplication;
import ua.itaysonlab.vkx.activity.AppActivity;
import ua.itaysonlab.vkxreborn.playback.service.PlaybackService;

/* JADX INFO: renamed from: lًٕؓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C15406l extends C1538l implements Function1 {

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final /* synthetic */ int f30107l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C15406l(int i, Object obj, Class cls, String str, String str2, int i2, int i3, int i4) {
        super(i, obj, cls, str, str2, i2, i3);
        this.f30107l = i4;
    }

    /* JADX WARN: Code duplicated, block: B:54:0x0125  */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        AppActivity appActivity;
        AppActivity appActivity2;
        int iNextIndex;
        Integer numValueOf;
        boolean zContains;
        int i = 1;
        int i2 = 15;
        int i3 = 2;
        int i4 = 3;
        InterfaceC14029l interfaceC14029l = null;
        int i5 = 0;
        switch (this.f30107l) {
            case 0:
                Uri uri = (Uri) obj;
                ((C15285l) this.f26698l).getClass();
                String queryParameter = uri.getQueryParameter("genre_id");
                String queryParameter2 = uri.getQueryParameter("person_id");
                if (queryParameter2 != null && (appActivity = C8183l.loadAd) != null) {
                    int i6 = Integer.parseInt(queryParameter2);
                    Integer numValueOf2 = queryParameter != null ? Integer.valueOf(Integer.parseInt(queryParameter)) : null;
                    appActivity.license(numValueOf2 != null ? new C15191l((String) null, new C6495l(i6, i5, numValueOf2)) : new C10266l(new C6495l(i6, i, numValueOf2)));
                }
                return Unit.INSTANCE;
            case 1:
                ((C15285l) this.f26698l).getClass();
                if (AbstractC8576l.yandex(((Uri) obj).getQueryParameter("act"), "buy_music_subscription") && (appActivity2 = C8183l.loadAd) != null) {
                    new C13330l(R.string.library_vkm_sub_upsell, R.string.library_vkm_sub_upsell_text, R.string.library_vkm_sub_upsell_act, null, null, new C7730l(25, appActivity2), null, 360).Signature(appActivity2);
                }
                return Unit.INSTANCE;
            case 2:
                String str = (String) obj;
                ((C15285l) this.f26698l).getClass();
                AppActivity appActivity3 = C8183l.loadAd;
                if (appActivity3 != null) {
                    appActivity3.license(new C10266l(new C1329l(str, i5)));
                }
                return Unit.INSTANCE;
            case 3:
                String str2 = (String) obj;
                ((C15285l) this.f26698l).getClass();
                AppActivity appActivity4 = C8183l.loadAd;
                if (appActivity4 != null) {
                    appActivity4.license(new C10266l(new C1329l(str2, i5)));
                }
                return Unit.INSTANCE;
            case 4:
                String str3 = (String) obj;
                ((C15285l) this.f26698l).getClass();
                AppActivity appActivity5 = C8183l.loadAd;
                if (appActivity5 != null) {
                    appActivity5.license(new C13379l(str3));
                }
                return Unit.INSTANCE;
            case 5:
                AbstractC6139l abstractC6139l = (AbstractC6139l) ((C5653l) this.f26698l).yandex.get();
                if (abstractC6139l != null) {
                    C6067l c6067lRemoteconfig = abstractC6139l.remoteconfig();
                    c6067lRemoteconfig.f12834l.yandex = new C11513l(c6067lRemoteconfig.f12835l, ((C12125l) c6067lRemoteconfig.f12836l.f33215l).purchase.values());
                }
                return Unit.INSTANCE;
            case 6:
                ((Boolean) obj).getClass();
                ((C1463l) this.f26698l).getClass();
                C16076l c16076l = VKXApplication.f36632l;
                if (c16076l == null) {
                    c16076l = null;
                }
                c16076l.getClass();
                AbstractC10999l.mopub(c16076l, null, 0, new C18160l(i3, interfaceC14029l, i2), 3);
                return Unit.INSTANCE;
            case 7:
                ((Boolean) obj).getClass();
                ((C1463l) this.f26698l).getClass();
                C16076l c16076l2 = VKXApplication.f36632l;
                if (c16076l2 == null) {
                    c16076l2 = null;
                }
                c16076l2.getClass();
                AbstractC10999l.mopub(c16076l2, null, 0, new C18160l(i3, interfaceC14029l, i2), 3);
                return Unit.INSTANCE;
            case 8:
                ((Boolean) obj).getClass();
                ((C1463l) this.f26698l).getClass();
                C16076l c16076l3 = VKXApplication.f36632l;
                if (c16076l3 == null) {
                    c16076l3 = null;
                }
                c16076l3.getClass();
                AbstractC10999l.mopub(c16076l3, null, 0, new C18160l(i3, interfaceC14029l, i2), 3);
                return Unit.INSTANCE;
            case 9:
                C14152l c14152l = (C14152l) obj;
                C4708l c4708l = ((C2885l) this.f26698l).f6284l;
                C11610l c11610l = c4708l.loadAd;
                if (c11610l == null) {
                    c11610l = (C11610l) C2885l.f6281l.getValue();
                }
                c11610l.getClass();
                C10094l c10094l = new C10094l();
                c10094l.yandex = c11610l.yandex;
                c10094l.loadAd = c11610l.appmetrica;
                AbstractC3984l.license(c10094l.crashlytics, c11610l.loadAd);
                AbstractC3984l.license(c10094l.amazon, c11610l.crashlytics);
                c10094l.purchase = c11610l.amazon;
                c10094l.billing = c11610l.purchase;
                c10094l.mopub = c11610l.billing;
                c10094l.admob = c11610l.mopub;
                c10094l.subs = c11610l.admob;
                c10094l.isPro = c11610l.subs;
                c10094l.firebase = c11610l.isPro;
                c10094l.smaato = c11610l.firebase;
                c10094l.remoteconfig = c11610l.smaato;
                c10094l.vip = c11610l.remoteconfig;
                c10094l.metrica = c11610l.vip;
                c10094l.startapp = c11610l.metrica;
                c10094l.adcel = c11610l.startapp;
                c10094l.ads = c11610l.adcel;
                c10094l.subscription = c11610l.ads;
                c10094l.tapsense = c11610l.subscription;
                c10094l.Signature = c11610l.tapsense;
                c10094l.license = c11610l.Signature;
                c10094l.pro = c11610l.license;
                c10094l.ad = c11610l.pro;
                c10094l.advert = c11610l.ad;
                c10094l.isVip = c11610l.advert;
                c10094l.signatures = c11610l.isVip;
                c10094l.premium = c11610l.signatures;
                c10094l.applovin = c11610l.premium;
                c10094l.appmetrica = c11610l.applovin;
                if (c4708l.loadAd == null) {
                    c10094l.yandex = new C12014l(11);
                }
                c4708l.yandex.invoke(c10094l);
                if (c14152l != null) {
                    Long l = c14152l.loadAd;
                    TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                    if (l != null) {
                        long jLongValue = l.longValue();
                        int i7 = AbstractC15190l.yandex;
                        if (jLongValue == Long.MAX_VALUE) {
                            jLongValue = 0;
                        }
                        c10094l.ad = AbstractC11432l.loadAd(jLongValue, timeUnit);
                    }
                    Long l2 = c14152l.crashlytics;
                    if (l2 != null) {
                        long jLongValue2 = l2.longValue();
                        int i8 = AbstractC15190l.yandex;
                        c10094l.advert = AbstractC11432l.loadAd(jLongValue2 == Long.MAX_VALUE ? 0L : jLongValue2, timeUnit);
                        c10094l.isVip = AbstractC11432l.loadAd(jLongValue2 != Long.MAX_VALUE ? jLongValue2 : 0L, timeUnit);
                    }
                }
                return new C11610l(c10094l);
            case 10:
                return ((C1243l) this.f26698l).yandex.get(obj);
            case 11:
                return Boolean.valueOf(((InterfaceC3804l) this.f26698l).test(obj));
            case 12:
                ((C14709l) this.f26698l).getClass();
                return Boolean.TRUE;
            case 13:
                ((C5803l) this.f26698l).subs.subscription((String) obj);
                return Unit.INSTANCE;
            case 14:
                ((C0324l) this.f26698l).admob.subscription((String) obj);
                return Unit.INSTANCE;
            case 15:
                return Boolean.valueOf(((InterfaceC13238l) this.f26698l).contains((String) obj));
            case 16:
                ((C5803l) this.f26698l).loadAd.invoke((C7933l) obj);
                return Unit.INSTANCE;
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                C8583l.advert((C8583l) this.f26698l, (C7933l) obj);
                return Unit.INSTANCE;
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                return Boolean.valueOf(((InterfaceC13238l) this.f26698l).contains((String) obj));
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                ((C13242l) this.f26698l).purchase.invoke((C7933l) obj);
                return Unit.INSTANCE;
            case 20:
                C8583l.advert((C8583l) this.f26698l, (C7933l) obj);
                return Unit.INSTANCE;
            case 21:
                ((C10056l) this.f26698l).m2870break(((Boolean) obj).booleanValue());
                return Unit.INSTANCE;
            case 22:
                ((Boolean) obj).getClass();
                C9365l.m2640abstract((C9365l) this.f26698l);
                return Unit.INSTANCE;
            case 23:
                ((Boolean) obj).getClass();
                Activity activityIsVip = ((C9365l) this.f26698l).isVip();
                AbstractC11708l.yandex(new Ctry(activityIsVip, new C10734l(null, activityIsVip.getString(R.string.notification), activityIsVip.getString(R.string.restart_prompt), new C8195l(activityIsVip.getString(R.string.restart_act), new C7282l(i4)), null, 241), 4));
                return Unit.INSTANCE;
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                ((Boolean) obj).getClass();
                C9365l.m2640abstract((C9365l) this.f26698l);
                return Unit.INSTANCE;
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                ((Boolean) obj).getClass();
                C9365l.m2640abstract((C9365l) this.f26698l);
                return Unit.INSTANCE;
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                return ((C2258l) this.f26698l).subs((String) obj);
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                PlaybackService playbackService = (PlaybackService) this.f26698l;
                int i9 = PlaybackService.f36828l;
                playbackService.signatures((Boolean) obj);
                return Unit.INSTANCE;
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                return PlaybackService.adcel((PlaybackService) this.f26698l, (InterfaceC14029l) obj);
            default:
                List<AbstractC5729l> list = (List) obj;
                ((C2182l) this.f26698l).getClass();
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list) {
                    if (((AbstractC5729l) obj2) instanceof C18459l) {
                        arrayList.add(obj2);
                    }
                }
                list.removeAll(arrayList);
                Iterator it = AbstractC16901l.m4240super(arrayList).iterator();
                while (it.hasNext()) {
                    list.add(0, (AbstractC5729l) it.next());
                }
                ListIterator listIterator = list.listIterator(list.size());
                while (true) {
                    if (!listIterator.hasPrevious()) {
                        iNextIndex = -1;
                    } else if (((AbstractC5729l) listIterator.previous()) instanceof C10463l) {
                        iNextIndex = listIterator.nextIndex();
                    }
                }
                if (iNextIndex > 0) {
                    C10463l c10463l = (C10463l) list.get(iNextIndex);
                    for (int i10 = 0; i10 < iNextIndex; i10++) {
                        AbstractC5729l abstractC5729l = (AbstractC5729l) list.remove(0);
                        C9426l c9426l = abstractC5729l instanceof C2996l ? ((C2996l) abstractC5729l).loadAd : abstractC5729l instanceof C10463l ? ((C10463l) abstractC5729l).yandex : null;
                        if (c9426l != null) {
                            c10463l.yandex.mo2154l(new C8250l(26, c9426l));
                        }
                        if (abstractC5729l instanceof C2185l) {
                            ((C2185l) abstractC5729l).yandex.yandex(null);
                        }
                    }
                }
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                int i11 = 0;
                for (AbstractC5729l abstractC5729l2 : list) {
                    int i12 = i11 + 1;
                    if (abstractC5729l2 instanceof C2185l) {
                        C2185l c2185l = (C2185l) abstractC5729l2;
                        String str4 = c2185l.yandex.yandex;
                        Set setM4229l = AbstractC16901l.m4229l(AbstractC16901l.m4218final(new C10160l(str4), c2185l.loadAd));
                        int size = list.size();
                        int i13 = i12;
                        while (true) {
                            if (i13 < size) {
                                AbstractC5729l abstractC5729l3 = (AbstractC5729l) list.get(i13);
                                if (abstractC5729l3 instanceof C2996l) {
                                    zContains = setM4229l.contains(new C10160l(((C2996l) abstractC5729l3).yandex));
                                } else if (abstractC5729l3 instanceof C2185l) {
                                    C2185l c2185l2 = (C2185l) abstractC5729l3;
                                    String str5 = c2185l2.yandex.yandex;
                                    Set setM4229l2 = AbstractC16901l.m4229l(AbstractC16901l.m4218final(new C10160l(str5), c2185l2.loadAd));
                                    if (AbstractC8576l.yandex(str4, str5) || !setM4229l.equals(setM4229l2)) {
                                        zContains = true;
                                    } else {
                                        zContains = false;
                                    }
                                } else {
                                    zContains = false;
                                }
                                if (zContains) {
                                    numValueOf = Integer.valueOf(i13);
                                } else {
                                    i13++;
                                }
                            } else {
                                numValueOf = null;
                            }
                        }
                    } else if (abstractC5729l2 instanceof C2996l) {
                        int size2 = list.size();
                        int i14 = i12;
                        while (true) {
                            if (i14 < size2) {
                                AbstractC5729l abstractC5729l4 = (AbstractC5729l) list.get(i14);
                                if ((abstractC5729l4 instanceof C2996l) && AbstractC8576l.yandex(((C2996l) abstractC5729l4).yandex, ((C2996l) abstractC5729l2).yandex)) {
                                    numValueOf = Integer.valueOf(i14);
                                } else {
                                    i14++;
                                }
                            } else {
                                numValueOf = null;
                            }
                        }
                    } else {
                        numValueOf = null;
                    }
                    if (numValueOf != null) {
                        AbstractC5729l abstractC5729l5 = (AbstractC5729l) list.get(numValueOf.intValue());
                        Log.d("CXCP", abstractC5729l2 + " is pruned by " + abstractC5729l5);
                        linkedHashSet.add(Integer.valueOf(i11));
                        if ((abstractC5729l2 instanceof C2996l) && (abstractC5729l5 instanceof C2996l)) {
                            ((C2996l) abstractC5729l5).loadAd.mo2154l(new C8250l(27, (C2996l) abstractC5729l2));
                        }
                    }
                    i11 = i12;
                }
                ArrayList<AbstractC5729l> arrayList2 = new ArrayList();
                Iterator it2 = AbstractC16901l.m4219finally(linkedHashSet).iterator();
                while (it2.hasNext()) {
                    arrayList2.add(list.remove(((Number) it2.next()).intValue() - arrayList2.size()));
                }
                for (AbstractC5729l abstractC5729l6 : arrayList2) {
                    if (abstractC5729l6 instanceof C2185l) {
                        ((C2185l) abstractC5729l6).yandex.yandex(null);
                    }
                }
                return Unit.INSTANCE;
        }
    }
}
