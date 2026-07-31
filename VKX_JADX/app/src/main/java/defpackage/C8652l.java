package defpackage;

import android.content.Context;
import android.content.Intent;
import android.database.ContentObserver;
import android.net.ConnectivityManager;
import android.net.Uri;
import androidx.car.app.navigation.model.Maneuver;
import androidx.work.impl.WorkDatabase;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.regex.Matcher;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import ua.itaysonlab.catalogkit.objects.Catalog2ReplacementOption;
import ua.itaysonlab.vkapi2.objects.music.AudioTrack;
import ua.itaysonlab.vkapi2.objects.users.VKProfile;
import ua.itaysonlab.vkxreborn.cache.realm.CachedPlaylist;

/* JADX INFO: renamed from: lًٌۗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C8652l implements Function0 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ Object f17832l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ Object f17833l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f17834l;

    public /* synthetic */ C8652l(C9270l c9270l, InterfaceC12244l interfaceC12244l) {
        this.f17834l = 1;
        this.f17833l = c9270l;
        this.f17832l = interfaceC12244l;
    }

    /* JADX WARN: Code duplicated, block: B:109:0x02ae A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:110:0x02b0 A[LOOP:0: B:100:0x027b->B:110:0x02b0, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:149:0x02b3 A[SYNTHETIC] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        C16811l c16811l;
        C6931l c6931l;
        int i = 1;
        InterfaceC14029l interfaceC14029l = null;
        byte b = 0;
        switch (this.f17834l) {
            case 0:
                AbstractC10999l.mopub((InterfaceC2262l) this.f17832l, null, 0, new C17972l((C9270l) this.f17833l, interfaceC14029l, i), 3);
                return Unit.INSTANCE;
            case 1:
                C9270l c9270l = (C9270l) this.f17833l;
                if (((Boolean) ((InterfaceC12244l) this.f17832l).getValue()).booleanValue()) {
                    C16287l c16287l = C16287l.yandex;
                    C16287l.crashlytics.advert(C16287l.loadAd[0], Boolean.valueOf(!c16287l.loadAd()));
                    c9270l.f19058l.setValue(Boolean.valueOf(c16287l.loadAd()));
                } else {
                    new C14107l().Signature(c9270l.isVip());
                }
                return Unit.INSTANCE;
            case 2:
                C10056l c10056l = (C10056l) this.f17832l;
                C5242l c5242l = (C5242l) this.f17833l;
                if (C12942l.purchase) {
                    C12942l.loadAd += 60;
                    C12942l.amazon += 60;
                }
                c10056l.m2876try(c5242l.yandex + 60);
                return Unit.INSTANCE;
            case 3:
                C16076l c16076l = (C16076l) this.f17832l;
                Function0 function0 = (Function0) this.f17833l;
                C16811l c16811l2 = c16076l.f31499l;
                boolean zStartapp = c16811l2 != null ? c16811l2.startapp() : false;
                Object objInvoke = function0.invoke();
                if (zStartapp && (c16811l = c16076l.f31499l) != null) {
                    c16811l.mo2801protected();
                }
                return objInvoke;
            case 4:
                ((C6038l) this.f17832l).m4125private(new C0471l(((AudioTrack) this.f17833l).crashlytics));
                return Unit.INSTANCE;
            case 5:
                ((C6449l) this.f17832l).f13478l = (Function2) this.f17833l;
                return Unit.INSTANCE;
            case 6:
                return AbstractC2632l.amazon((Context) this.f17832l, ((C6286l) this.f17833l).yandex.concat(".preferences_pb"));
            case 7:
                C10530l c10530l = (C10530l) this.f17832l;
                c10530l.f21422l.invoke((C15050l) this.f17833l);
                c10530l.purchase();
                return Unit.INSTANCE;
            case 8:
                ((Function1) this.f17832l).invoke((Function2) ((C5601l) this.f17833l).f11899l);
                return Unit.INSTANCE;
            case 9:
                C6295l c6295l = (C6295l) this.f17832l;
                C6931l c6931l2 = (C6931l) this.f17833l;
                Object[] objArr = c6295l.loadAd;
                long[] jArr = c6295l.yandex;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i2 = 0;
                    while (true) {
                        long j = jArr[i2];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i3 = 8 - ((~(i2 - length)) >>> 31);
                            for (int i4 = 0; i4 < i3; i4++) {
                                if ((255 & j) < 128) {
                                    c6931l2.signatures(objArr[(i2 << 3) + i4]);
                                }
                                j >>= 8;
                            }
                            if (i3 == 8) {
                                if (i2 != length) {
                                    i2++;
                                }
                            }
                        } else if (i2 != length) {
                            i2++;
                        }
                    }
                }
                return Unit.INSTANCE;
            case 10:
                C11155l c11155l = (C11155l) this.f17832l;
                CharSequence charSequence = (CharSequence) this.f17833l;
                Matcher matcher = c11155l.f22430l.matcher(charSequence);
                if (matcher.find(0)) {
                    return new C0711l(matcher, charSequence);
                }
                return null;
            case 11:
                ((C18574l) this.f17832l).yandex.unregisterContentObserver((ContentObserver) this.f17833l);
                return Unit.INSTANCE;
            case 12:
                C7883l c7883l = (C7883l) this.f17832l;
                AbstractC10999l.mopub(AbstractC11990l.firebase(c7883l), null, 0, new C8036l(c7883l, ((C16464l) this.f17833l).yandex, (InterfaceC14029l) null), 3);
                return Unit.INSTANCE;
            case 13:
                return AbstractC16814l.amazon((String) this.f17832l, C0196l.purchase, new InterfaceC18035l[0], new C10082l((C14691l) this.f17833l, b == true ? 1 : 0));
            case 14:
                EnumC10474l enumC10474l = (EnumC10474l) this.f17832l;
                C11446l c11446l = (C11446l) this.f17833l;
                int iOrdinal = enumC10474l.ordinal();
                if (iOrdinal != 0) {
                    if (iOrdinal == 1) {
                        c11446l.crashlytics.invoke();
                    } else {
                        if (iOrdinal != 2) {
                            C18725l.billing();
                            return null;
                        }
                        c11446l.smaato.setValue("");
                        c11446l.amazon.invoke();
                        c11446l.remoteconfig(true);
                    }
                }
                return Unit.INSTANCE;
            case 15:
                ((C0956l) this.f17832l).loadAd.invoke(Long.valueOf(((C8032l) this.f17833l).yandex));
                return Unit.INSTANCE;
            case 16:
                ((C10700l) this.f17832l).f21708l = AbstractC13402l.loadAd((C9084l) this.f17833l, AbstractC1629l.yandex);
                return Unit.INSTANCE;
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                C0205l c0205l = (C0205l) this.f17832l;
                long j2 = ((C4999l) ((InterfaceC8714l) this.f17833l).getValue()).yandex;
                C3242l c3242lSubs = c0205l.subs();
                long jAmazon = 9205357640488583168L;
                if (c3242lSubs != null) {
                    EnumC1826l enumC1826lAdmob = c0205l.admob();
                    int i5 = enumC1826lAdmob == null ? -1 : AbstractC11486l.yandex[enumC1826lAdmob.ordinal()];
                    if (i5 != -1) {
                        if (i5 == 1) {
                            jAmazon = AbstractC2044l.amazon(c0205l, j2, c3242lSubs.yandex);
                        } else {
                            if (i5 != 2) {
                                if (i5 != 3) {
                                    C18725l.billing();
                                    return null;
                                }
                                C8339l.smaato("SelectionContainer does not support cursor");
                                return null;
                            }
                            jAmazon = AbstractC2044l.amazon(c0205l, j2, c3242lSubs.loadAd);
                        }
                    }
                }
                return new C1187l(jAmazon);
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                ((C9434l) this.f17832l).m4125private((AbstractC17777l) ((C8803l) this.f17833l).invoke());
                return Unit.INSTANCE;
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                C8854l c8854l = (C8854l) this.f17832l;
                ConnectivityManager connectivityManager = (ConnectivityManager) this.f17833l;
                synchronized (C18181l.loadAd) {
                    LinkedHashMap linkedHashMap = C18181l.crashlytics;
                    linkedHashMap.remove(c8854l);
                    if (linkedHashMap.isEmpty()) {
                        C14513l.tapsense().vip(AbstractC10076l.yandex, "NetworkRequestConstraintController unregister shared callback");
                        connectivityManager.unregisterNetworkCallback(C18181l.yandex);
                        C18181l.billing = null;
                        C18181l.amazon = null;
                        C18181l.purchase = false;
                    }
                    break;
                }
                return Unit.INSTANCE;
            case 20:
                C8748l c8748l = (C8748l) this.f17832l;
                CachedPlaylist cachedPlaylist = (CachedPlaylist) this.f17833l;
                c8748l.m4125private(new C18306l(cachedPlaylist.crashlytics(), new VKProfile(cachedPlaylist.pro(), null, null, null, cachedPlaylist.isVip(), null, null, 110)));
                return Unit.INSTANCE;
            case 21:
                C15851l c15851l = (C15851l) this.f17832l;
                C17006l c17006l = (C17006l) this.f17833l;
                if (!AbstractC8576l.yandex(c15851l, c17006l.yandex)) {
                    AbstractC3984l.ad(c17006l.loadAd, new C16931l(27, c15851l));
                    C4224l c4224l = c17006l.crashlytics;
                    if (c4224l != null && (c6931l = c4224l.yandex) != null) {
                        c6931l.subscription(c4224l, null);
                    }
                }
                return Unit.INSTANCE;
            case 22:
                C14089l c14089l = (C14089l) this.f17832l;
                C15968l c15968l = (C15968l) this.f17833l;
                c14089l.isVip().startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://vk.com/id" + c15968l.f31342l)));
                return Unit.INSTANCE;
            case 23:
                ((Function1) this.f17832l).invoke((C0247l) this.f17833l);
                return Unit.INSTANCE;
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                return ((C6908l) this.f17832l).invoke((WorkDatabase) this.f17833l);
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                C0675l c0675l = (C0675l) this.f17832l;
                if (((Boolean) ((InterfaceC12244l) this.f17833l).getValue()).booleanValue()) {
                    c0675l.m4125private(new C5039l(0));
                } else {
                    new C14107l().Signature(c0675l.isVip());
                }
                return Unit.INSTANCE;
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                Catalog2ReplacementOption catalog2ReplacementOption = (Catalog2ReplacementOption) this.f17832l;
                Function1 function1 = (Function1) this.f17833l;
                Integer num = catalog2ReplacementOption.amazon;
                if (num == null || num.intValue() != 1) {
                    function1.invoke(catalog2ReplacementOption);
                }
                return Unit.INSTANCE;
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                C1557l c1557l = (C1557l) this.f17832l;
                List list = (List) this.f17833l;
                C6916l c6916l = AbstractC18386l.yandex;
                return Boolean.valueOf(AbstractC18386l.yandex(c1557l.yandex, list));
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                return new C12324l((EnumC16440l) this.f17832l, (Function1) this.f17833l);
            default:
                return new C7463l((EnumC12805l) this.f17832l, (Function1) this.f17833l);
        }
    }

    public /* synthetic */ C8652l(Object obj, Object obj2, int i) {
        this.f17834l = i;
        this.f17832l = obj;
        this.f17833l = obj2;
    }
}
