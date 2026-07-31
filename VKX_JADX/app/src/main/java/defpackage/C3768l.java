package defpackage;

import android.net.ConnectivityManager;
import android.view.InputDevice;
import android.view.KeyEvent;
import android.view.View;
import androidx.car.app.navigation.model.Maneuver;
import io.realm.kotlin.internal.interop.LongPointerWrapper;
import io.realm.kotlin.internal.interop.realm_value_t;
import io.realm.kotlin.internal.interop.realmcJNI;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import ua.itaysonlab.vkapi2.objects.music.catalog.CatalogArtist;
import ua.itaysonlab.vkx.activity.AppActivity;

/* JADX INFO: renamed from: lؕۦؓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3768l implements Function1 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final Object f7847l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final Object f7848l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f7849l;

    public C3768l(C3585l c3585l, C5434l c5434l, realm_value_t realm_value_tVar) {
        this.f7849l = 22;
        this.f7848l = c5434l;
        this.f7847l = realm_value_tVar;
    }

    private final Object yandex(Object obj) {
        C11919l c11919l = (C11919l) this.f7848l;
        Object obj2 = c11919l.f23763l;
        C2397l c2397l = (C2397l) this.f7847l;
        synchronized (obj2) {
            ((ArrayList) c11919l.f23767l).remove(c2397l);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x005f  */
    /* JADX WARN: Code duplicated, block: B:242:0x076c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:243:0x076e  */
    /* JADX WARN: Code duplicated, block: B:259:0x07c1  */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        InterfaceC15234l interfaceC15234lPro;
        C9217l c9217l;
        long j;
        C15053l c15053lRemoteconfig;
        InterfaceC17477l interfaceC17477l;
        String str;
        int i = 25;
        int i2 = 21;
        int i3 = 6;
        int i4 = 19;
        int i5 = 23;
        int i6 = 5;
        int i7 = 2;
        boolean zMopub = true;
        boolean z = false;
        switch (this.f7849l) {
            case 0:
                C4619l c4619l = (C4619l) this.f7848l;
                C10038l c10038l = (C10038l) c4619l.f9372l;
                InterfaceC13789l interfaceC13789l = ((C1850l) this.f7847l).yandex;
                InterfaceC1910l interfaceC1910l = (InterfaceC1910l) obj;
                if (interfaceC1910l instanceof C6727l) {
                    ((C7757l) c10038l.f20463l).tapsense.getClass();
                    if (!((C6727l) interfaceC1910l).mopub && ((EnumC7061l) c4619l.f9374l) != EnumC7061l.TYPE_PARAMETER_BOUNDS) {
                        if (interfaceC13789l != null) {
                            C3498l c3498l = AbstractC16860l.purchase;
                            interfaceC15234lPro = ((AbstractC18041l) interfaceC13789l).mo1339native().pro();
                            if (interfaceC15234lPro != null || AbstractC16860l.ads(interfaceC15234lPro) == null) {
                                zMopub = false;
                            } else {
                                ((C7757l) c10038l.f20463l).adcel.getClass();
                                Object objCrashlytics = C12178l.crashlytics(interfaceC1910l, AbstractC3333l.tapsense);
                                if (objCrashlytics == null) {
                                    zMopub = false;
                                } else {
                                    ArrayList arrayListYandex = C12178l.yandex(objCrashlytics, false);
                                    if (arrayListYandex.isEmpty()) {
                                        zMopub = false;
                                    } else {
                                        Iterator it = arrayListYandex.iterator();
                                        while (it.hasNext()) {
                                            if (AbstractC8576l.yandex((String) it.next(), "TYPE")) {
                                                ((C7757l) c10038l.f20463l).tapsense.getClass();
                                            }
                                        }
                                        zMopub = false;
                                    }
                                }
                            }
                        } else {
                            zMopub = false;
                        }
                    }
                } else if (interfaceC13789l != null) {
                    C3498l c3498l2 = AbstractC16860l.purchase;
                    interfaceC15234lPro = ((AbstractC18041l) interfaceC13789l).mo1339native().pro();
                    if (interfaceC15234lPro != null) {
                        zMopub = false;
                    } else {
                        zMopub = false;
                    }
                } else {
                    zMopub = false;
                }
                return Boolean.valueOf(zMopub);
            case 1:
                C16750l c16750l = (C16750l) this.f7848l;
                C9217l[] c9217lArr = (C9217l[]) this.f7847l;
                int iIntValue = ((Number) obj).intValue();
                if (c16750l == null || (c9217l = (C9217l) c16750l.yandex.get(Integer.valueOf(iIntValue))) == null) {
                    return (iIntValue < 0 || iIntValue >= c9217lArr.length) ? C9217l.billing : c9217lArr[iIntValue];
                }
                return c9217l;
            case 2:
                ((ConnectivityManager) ((C7026l) this.f7848l).f14720l).unregisterNetworkCallback((C10812l) this.f7847l);
                return Unit.INSTANCE;
            case 3:
                List list = (List) obj;
                EnumC6358l enumC6358l = (EnumC6358l) this.f7847l;
                C16553l c16553l = (C16553l) this.f7848l;
                boolean z2 = c16553l.f32500l;
                CatalogArtist catalogArtist = c16553l.f32501l;
                if (z2) {
                    AbstractC11397l.mopub(c16553l.f5081l, new C10177l(c16553l, enumC6358l, list));
                } else {
                    C15478l c15478l = C15478l.purchase;
                    AppActivity appActivity = (AppActivity) c16553l.f5081l;
                    C17050l c17050l = new C17050l(catalogArtist.loadAd + '_' + enumC6358l.f13325l, catalogArtist.yandex + " - " + enumC6358l.f13326l, list);
                    c15478l.getClass();
                    C15478l.loadAd(appActivity, c17050l);
                }
                return Unit.INSTANCE;
            case 4:
                AbstractC10999l.mopub((InterfaceC2262l) this.f7848l, null, 0, new C5163l((String) this.f7847l, (C7968l) obj, 0 == true ? 1 : 0, i3), 3);
                return Unit.INSTANCE;
            case 5:
                KeyEvent keyEvent = ((C18583l) obj).yandex;
                if (((C17812l) this.f7848l).yandex() == EnumC7170l.f15003l && keyEvent.getKeyCode() == 4 && AbstractC16422l.purchase(keyEvent) == 1) {
                    ((C16173l) this.f7847l).mopub(null);
                } else {
                    zMopub = false;
                }
                return Boolean.valueOf(zMopub);
            case 6:
                C12014l c12014l = (C12014l) this.f7848l;
                C11296l c11296l = (C11296l) this.f7847l;
                C7644l c7644l = c11296l.f22763l;
                C3498l c3498l3 = (C3498l) obj;
                C16400l c16400l = (C16400l) ((LinkedHashMap) c12014l.f23941l).get(c3498l3);
                if (c16400l != null) {
                    return C12167l.inmobi((C16412l) ((C0511l) c7644l.f15738l).yandex, c11296l, c3498l3, (C2278l) c12014l.f23944l, new C0846l((C16412l) ((C0511l) c7644l.f15738l).yandex, new C0340l(c11296l, c16400l, 0 == true ? 1 : 0, 15)), InterfaceC5706l.f12087l);
                }
                return null;
            case 7:
                return ((C4741l) this.f7848l).invoke(((List) this.f7847l).get(((Number) obj).intValue()));
            case 8:
                ((C4741l) this.f7848l).invoke(((List) this.f7847l).get(((Number) obj).intValue()));
                return 2;
            case 9:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                C7652l c7652l = (C7652l) this.f7847l;
                C12376l c12376l = ((C7246l) this.f7848l).f15075l;
                if (zBooleanValue) {
                    c12376l.put(c7652l.crashlytics, Boolean.TRUE);
                } else {
                    c12376l.remove(c7652l.crashlytics);
                }
                return Unit.INSTANCE;
            case 10:
                return ((C4741l) this.f7848l).invoke(((List) this.f7847l).get(((Number) obj).intValue()));
            case 11:
                C8739l c8739l = (C8739l) obj;
                synchronized (AbstractC9620l.crashlytics) {
                    j = AbstractC9620l.purchase;
                    AbstractC9620l.purchase = 1 + j;
                }
                return new C1852l(j, c8739l, (Function1) this.f7848l, (Function1) this.f7847l);
            case 12:
                return yandex(obj);
            case 13:
                C15284l c15284l = (C15284l) this.f7848l;
                C10038l c10038l2 = (C10038l) this.f7847l;
                C3498l c3498l4 = (C3498l) obj;
                C2278l c2278l = c15284l.ads;
                InterfaceC17477l interfaceC17477l2 = c15284l.vip;
                if (((Set) c2278l.invoke()).contains(c3498l4)) {
                    C5008l c5008l = ((C7757l) c10038l2.f20463l).loadAd;
                    C3624l c3624lAmazon = AbstractC3759l.billing(interfaceC17477l2).amazon(c3498l4);
                    c5008l.getClass();
                    C2312l c2312l = c3624lAmazon.yandex;
                    String strReplace = c3624lAmazon.loadAd.yandex.yandex.replace('.', '$');
                    if (!c2312l.yandex.crashlytics()) {
                        strReplace = c2312l.yandex.yandex + '.' + strReplace;
                    }
                    Class clsSubs = AbstractC16131l.subs((ClassLoader) c5008l.f10245l, strReplace);
                    C12875l c12875l = clsSubs != null ? new C12875l(clsSubs) : null;
                    if (c12875l == null) {
                        return null;
                    }
                    C18174l c18174l = new C18174l(c10038l2, interfaceC17477l2, c12875l, null);
                    ((C7757l) c10038l2.f20463l).subscription.getClass();
                    return c18174l;
                }
                if (!((Set) c15284l.subscription.invoke()).contains(c3498l4)) {
                    C0865l c0865l = (C0865l) ((Map) c15284l.tapsense.invoke()).get(c3498l4);
                    if (c0865l == null) {
                        return null;
                    }
                    C7757l c7757l = (C7757l) c10038l2.f20463l;
                    C16412l c16412l = c7757l.yandex;
                    C15817l c15817l = new C15817l(c15284l, i7);
                    c16412l.getClass();
                    return C12167l.inmobi(c7757l.yandex, c15284l.vip, c3498l4, new C2278l(c16412l, c15817l), AbstractC12081l.billing(c10038l2, c0865l), c7757l.isPro.startapp(c0865l));
                }
                C10227l c10227lAdmob = AbstractC14055l.admob();
                ((C13772l) ((C7757l) c10038l2.f20463l).ad).getClass();
                C10227l c10227lPurchase = AbstractC14055l.purchase(c10227lAdmob);
                int iPro = c10227lPurchase.pro();
                if (iPro == 0) {
                    return null;
                }
                if (iPro == 1) {
                    return (InterfaceC17477l) AbstractC16901l.m4208abstract(c10227lPurchase);
                }
                C18073l.firebase(c10227lPurchase, "Multiple classes with same name are generated: ");
                return null;
            case 14:
                C17134l c17134l = (C17134l) this.f7848l;
                C15284l c15284l2 = (C15284l) this.f7847l;
                C3498l c3498l5 = (C3498l) obj;
                return AbstractC8576l.yandex(c17134l.getName(), c3498l5) ? Collections.singletonList(c17134l) : AbstractC16901l.m4232new(c15284l2.m3955private(c3498l5), c15284l2.m3952extends(c3498l5));
            case 15:
                C7676l c7676l = (C7676l) this.f7848l;
                C10038l c10038l3 = c7676l.loadAd;
                C10038l c10038l4 = (C10038l) this.f7847l;
                C8059l c8059l = (C8059l) obj;
                C16760l c16760l = c7676l.metrica;
                C2312l c2312l2 = c16760l.f7826l;
                C3498l c3498l6 = c8059l.yandex;
                C16781l c16781l = c2312l2.yandex;
                C2312l c2312l3 = C2312l.crashlytics;
                C16781l c16781l2 = AbstractC2130l.admob(c3498l6).yandex;
                c16781l2.crashlytics();
                String str2 = c16781l2.yandex;
                C12875l c12875l2 = c8059l.loadAd;
                C7757l c7757l2 = (C7757l) c10038l4.f20463l;
                if (c12875l2 != null) {
                    C15053l c15053l = c7757l2.crashlytics;
                    C0511l c0511l = ((C7757l) c10038l3.f20463l).amazon.yandex;
                    if (c0511l == null) {
                        c0511l = null;
                    }
                    ((C17334l) c0511l.crashlytics).getClass();
                    C4995l c4995l = C4995l.mopub;
                    c15053l.getClass();
                    C2312l c2312lCrashlytics = c12875l2.crashlytics();
                    c15053lRemoteconfig = (c2312lCrashlytics == null || (str = c2312lCrashlytics.yandex.yandex) == null) ? null : c15053l.remoteconfig(str);
                } else {
                    C15053l c15053l2 = c7757l2.crashlytics;
                    C0511l c0511l2 = ((C7757l) c10038l3.f20463l).amazon.yandex;
                    if (c0511l2 == null) {
                        c0511l2 = null;
                    }
                    ((C17334l) c0511l2.crashlytics).getClass();
                    C4995l c4995l2 = C4995l.mopub;
                    c15053l2.getClass();
                    String strReplace2 = str2.replace('.', '$');
                    if (!c16781l.crashlytics()) {
                        strReplace2 = c2312l2 + '.' + strReplace2;
                    }
                    c15053lRemoteconfig = c15053l2.remoteconfig(strReplace2);
                }
                C5222l c5222l = c15053lRemoteconfig != null ? (C5222l) c15053lRemoteconfig.f29576l : null;
                C3624l c3624lYandex = c5222l != null ? AbstractC1845l.yandex(c5222l.yandex) : null;
                if (c3624lYandex != null && (c3624lYandex.mopub() || c3624lYandex.crashlytics)) {
                    return null;
                }
                Object c11454l = C16092l.loadAd;
                if (c5222l != null) {
                    if (((EnumC4474l) c5222l.loadAd.crashlytics) == EnumC4474l.CLASS) {
                        C17367l c17367l = ((C7757l) c10038l3.f20463l).amazon;
                        C8160l c8160lBilling = c17367l.billing(c5222l);
                        if (c8160lBilling == null) {
                            interfaceC17477l = null;
                        } else {
                            C0511l c0511l3 = c17367l.yandex;
                            if (c0511l3 == null) {
                                c0511l3 = null;
                            }
                            interfaceC17477l = (InterfaceC17477l) ((C1683l) c0511l3.subscription).loadAd.invoke(new C16518l(AbstractC1845l.yandex(c5222l.yandex), c8160lBilling));
                        }
                        if (interfaceC17477l != null) {
                            c11454l = new C11454l(interfaceC17477l);
                        }
                    } else {
                        c11454l = C14056l.loadAd;
                    }
                }
                if (c11454l instanceof C11454l) {
                    return ((C11454l) c11454l).loadAd;
                }
                if (c11454l instanceof C14056l) {
                    return null;
                }
                if (!(c11454l instanceof C16092l)) {
                    C18725l.billing();
                    return null;
                }
                if (c12875l2 == null) {
                    C5008l c5008l2 = c7757l2.loadAd;
                    c5008l2.getClass();
                    String strReplace3 = str2.replace('.', '$');
                    if (!c16781l.crashlytics()) {
                        strReplace3 = c16781l.yandex + '.' + strReplace3;
                    }
                    Class clsSubs2 = AbstractC16131l.subs((ClassLoader) c5008l2.f10245l, strReplace3);
                    c12875l2 = clsSubs2 != null ? new C12875l(clsSubs2) : null;
                }
                C2312l c2312lCrashlytics2 = c12875l2 != null ? c12875l2.crashlytics() : null;
                if (c2312lCrashlytics2 == null || c2312lCrashlytics2.yandex.crashlytics() || !c2312lCrashlytics2.loadAd().equals(c16760l.f7826l)) {
                    return null;
                }
                C18174l c18174l2 = new C18174l(c10038l4, c16760l, c12875l2, null);
                c7757l2.subscription.getClass();
                return c18174l2;
            case 16:
                C9426l c9426l = (C9426l) this.f7848l;
                C12094l c12094l = (C12094l) this.f7847l;
                if (c9426l == c12094l.admob) {
                    c12094l.admob = null;
                }
                return Unit.INSTANCE;
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                return ((C18334l) this.f7848l).invoke(((List) this.f7847l).get(((Number) obj).intValue()));
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                long j2 = ((C1187l) obj).yandex;
                AbstractC17948l.mopub((View) this.f7848l, ((C18554l) ((InterfaceC12244l) this.f7847l).getValue()).f36219l);
                return Unit.INSTANCE;
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                int iIntValue2 = ((Number) obj).intValue();
                return ((C8163l) this.f7848l).invoke(Integer.valueOf(iIntValue2), ((AbstractC18082l) this.f7847l).get(iIntValue2));
            case 20:
                ((AbstractC2069l) this.f7848l).loadAd((InterfaceC0207l) this.f7847l, (InterfaceC0207l) obj);
                return Unit.INSTANCE;
            case 21:
                C10238l c10238l = (C10238l) obj;
                String str3 = "obj";
                c10238l.yandex.add(new C13645l(str3, C17334l.f33653l, i5));
                C1693l c1693l = new C1693l(str3, i6);
                String str4 = "concatAudioId";
                C9676l c9676l = new C9676l("\"\"", 3);
                C1693l c1693l2 = (C1693l) this.f7848l;
                int i8 = 24;
                C13645l c13645l = new C13645l(new C13645l(new C13568l(c9676l, c1693l2.crashlytics("owner_id"), 26), new C9676l("\"_\"", 3), i8), c1693l2.crashlytics("id"), i8);
                ArrayList arrayList = c10238l.yandex;
                arrayList.add(new C13568l(str4, c13645l, i));
                C1693l c1693l3 = new C1693l(str4, i6);
                arrayList.add(new C5633l(c1693l.crashlytics("track"), c1693l2, 0 == true ? 1 : 0));
                C1693l c1693lCrashlytics = c1693l.crashlytics("stream_url");
                C0099l c0099l = new C0099l(1);
                c0099l.amazon("audio_id", c1693l3);
                c0099l.purchase("preview_type", "longtap");
                Unit unit = Unit.INSTANCE;
                arrayList.add(new C13568l(c1693lCrashlytics, new C8634l("audio.getAudioPreviewUrl", c0099l, 12), 27));
                arrayList.add(new C0848l(((C1693l) this.f7847l).crashlytics("items"), c1693l, 0 == true ? 1 : 0));
                return Unit.INSTANCE;
            case 22:
                realm_value_t realm_value_tVar = ((C14864l) obj).yandex;
                C5434l c5434l = (C5434l) this.f7848l;
                LongPointerWrapper longPointerWrapper = c5434l.f11651l;
                realm_value_t realm_value_tVar2 = (realm_value_t) this.f7847l;
                realm_value_t realm_value_tVar3 = new realm_value_t();
                long ptr$cinterop_release = longPointerWrapper.getPtr$cinterop_release();
                int i9 = AbstractC9795l.yandex;
                realmcJNI.realm_dictionary_find(ptr$cinterop_release, realm_value_tVar2.yandex, realm_value_tVar2, realm_value_tVar3.yandex, realm_value_tVar3, new boolean[1]);
                boolean[] zArr = new boolean[1];
                realmcJNI.realm_dictionary_insert(longPointerWrapper.getPtr$cinterop_release(), realm_value_tVar2.yandex, realm_value_tVar2, realm_value_tVar.yandex, realm_value_tVar, new long[1], zArr);
                return new C8195l(c5434l.purchase(realm_value_tVar3, realm_value_tVar2), Boolean.valueOf(zArr[0]));
            case 23:
                InterfaceC13349l interfaceC13349l = (InterfaceC13349l) obj;
                C12870l c12870l = (C12870l) this.f7848l;
                C11183l c11183l = ((C17448l) this.f7847l).yandex;
                C10417l c10417l = c11183l.f22487l;
                AbstractC13359l.amazon(interfaceC13349l, c12870l, c11183l, 0L, interfaceC13349l.admob(), c10417l != null ? AbstractC17551l.yandex(c10417l) : null);
                return Unit.INSTANCE;
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                List list2 = ((C18571l) this.f7848l).loadAd;
                C10724l c10724l = C10724l.f21732l;
                ((C1336l) obj).firebase(list2.size(), new C13512l(18, list2), new C13512l(list2, i4, 0 == true ? 1 : 0), new C15578l(802480018, true, new C6780l(list2, (C12457l) this.f7847l, i5)));
                return Unit.INSTANCE;
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                List list3 = ((C6270l) this.f7848l).loadAd;
                C0449l c0449l = C0449l.f1631l;
                ((C1336l) obj).firebase(list3.size(), new C13512l(20, list3), new C13512l(list3, i2, z), new C15578l(802480018, true, new C6780l(list3, (C9169l) this.f7847l, i)));
                return Unit.INSTANCE;
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                return ((C1698l) this.f7848l).invoke(((InterfaceC13238l) this.f7847l).get(((Number) obj).intValue()));
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                KeyEvent keyEvent2 = ((C18583l) obj).yandex;
                InterfaceC6497l interfaceC6497l = (InterfaceC6497l) this.f7848l;
                InputDevice device = keyEvent2.getDevice();
                if (device == null || !device.supportsSource(513) || ((device.isVirtual() && keyEvent2.getSource() != 33554433) || AbstractC16422l.purchase(keyEvent2) != 2 || keyEvent2.getSource() == 257)) {
                    zMopub = false;
                } else if (AbstractC0532l.yandex(19, keyEvent2)) {
                    zMopub = ((C15552l) interfaceC6497l).mopub(5, true);
                } else if (AbstractC0532l.yandex(20, keyEvent2)) {
                    zMopub = ((C15552l) interfaceC6497l).mopub(6, true);
                } else if (AbstractC0532l.yandex(21, keyEvent2)) {
                    zMopub = ((C15552l) interfaceC6497l).mopub(3, true);
                } else if (AbstractC0532l.yandex(22, keyEvent2)) {
                    zMopub = ((C15552l) interfaceC6497l).mopub(4, true);
                } else if (AbstractC0532l.yandex(23, keyEvent2)) {
                    InterfaceC8533l interfaceC8533l = ((C17812l) this.f7847l).crashlytics;
                    if (interfaceC8533l != null) {
                        ((C4666l) interfaceC8533l).loadAd();
                    }
                } else {
                    zMopub = false;
                }
                return Boolean.valueOf(zMopub);
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                ((C16328l) this.f7848l).yandex.billing.remoteconfig((C2589l) this.f7847l);
                return Unit.INSTANCE;
            default:
                int iIntValue3 = ((Number) obj).intValue();
                return ((C14813l) this.f7848l).invoke(Integer.valueOf(iIntValue3), ((InterfaceC13238l) this.f7847l).get(iIntValue3));
        }
    }

    public /* synthetic */ C3768l(Object obj, Object obj2, int i) {
        this.f7849l = i;
        this.f7848l = obj;
        this.f7847l = obj2;
    }
}
