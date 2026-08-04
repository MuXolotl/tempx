package defpackage;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import androidx.car.app.navigation.model.Maneuver;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import ua.itaysonlab.vkapi2.objects.music.catalog.CustomCatalogBlockItem;
import ua.itaysonlab.vkapi2.objects.music.playlist.metadata.MainArtist;
import ua.itaysonlab.vkx.R;
import ua.itaysonlab.vkx.VKXApplication;
import ua.itaysonlab.vkx.activity.AppActivity;

/* JADX INFO: renamed from: lؑٔۦ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C0340l implements Function0 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final Object f1392l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final Object f1393l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f1394l;

    public C0340l(C4975l c4975l, C5073l c5073l, C7117l c7117l) {
        this.f1394l = 8;
        this.f1393l = c5073l;
        this.f1392l = c7117l;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() throws IOException {
        C0861l c0861lSmaato;
        C0861l c0861l;
        int i = this.f1394l;
        int i2 = 2;
        int i3 = 3;
        final int i4 = 0;
        final int i5 = 1;
        byte b = 0;
        Object obj = this.f1393l;
        Object obj2 = this.f1392l;
        switch (i) {
            case 0:
                C16017l.f31395l.getClass();
                return AbstractC3605l.subscription(new C2144l(C16412l.purchase, new C7646l(i2, this)), C16017l.f31394l, ((AbstractC15719l) obj2).metrica(), Collections.EMPTY_LIST, false);
            case 1:
                StringBuilder sb = new StringBuilder();
                sb.append('@');
                sb.append(((Class) obj).getCanonicalName());
                AbstractC16901l.m4216else(((Map) obj2).entrySet(), sb, ", ", "(", ")", C5818l.f12233l, 48);
                return sb.toString();
            case 2:
                C16553l c16553l = (C16553l) obj;
                Activity activity = c16553l.f5081l;
                EnumC6358l enumC6358l = (EnumC6358l) obj2;
                String str = enumC6358l.f13325l;
                C3768l c3768l = new C3768l(c16553l, enumC6358l, i3);
                int i6 = C16553l.f32499l;
                AbstractC9033l.crashlytics((AppActivity) activity, new C0384l(c3768l, c16553l, str, (InterfaceC14029l) null));
                c16553l.purchase();
                return Unit.INSTANCE;
            case 3:
                ((Function1) obj).invoke((C7946l) obj2);
                return Unit.INSTANCE;
            case 4:
                ((Function1) obj).invoke((C5419l) obj2);
                return Unit.INSTANCE;
            case 5:
                C9991l c9991l = (C9991l) obj;
                String str2 = ((MainArtist) obj2).yandex;
                if (str2 != null) {
                    c9991l.m4125private(new C13379l(str2));
                }
                return Unit.INSTANCE;
            case 6:
                File file = AbstractC8474l.yandex;
                CustomCatalogBlockItem customCatalogBlockItem = (CustomCatalogBlockItem) obj;
                LinkedHashMap linkedHashMap = AbstractC8474l.loadAd;
                String str3 = customCatalogBlockItem.mopub;
                if (linkedHashMap.containsKey(str3)) {
                    linkedHashMap.remove(str3);
                } else {
                    linkedHashMap.put(str3, customCatalogBlockItem.yandex);
                }
                File file2 = AbstractC8474l.yandex;
                Set setEntrySet = linkedHashMap.entrySet();
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : setEntrySet) {
                    Map.Entry entry = (Map.Entry) obj3;
                    if (((CharSequence) entry.getKey()).length() > 0 && ((CharSequence) entry.getValue()).length() > 0) {
                        arrayList.add(obj3);
                    }
                }
                AbstractC2030l.metrica(file2, AbstractC16901l.m4210case(arrayList, "\n", null, null, new C1306l(19), 30));
                VKXApplication vKXApplication = VKXApplication.f36631l;
                AbstractC12832l.mopub(C10088l.yandex, vKXApplication != null ? vKXApplication : null);
                ((C5891l) obj2).f12415l.setValue(AbstractC16901l.m4213const(AbstractC8474l.loadAd.keySet()));
                return Unit.INSTANCE;
            case 7:
                C7044l c7044l = (C7044l) obj;
                String str4 = (String) ((C8195l) obj2).f17098l;
                C1062l c1062lM2163public = c7044l.m2163public();
                String strYandex = AbstractC2617l.yandex();
                C12647l c12647l = c7044l.f14761l;
                c1062lM2163public.getClass();
                C18096l c18096lAmazon = c1062lM2163public.amazon(new C18409l(c1062lM2163public, c12647l), AbstractC12216l.class.getName());
                c1062lM2163public.isPro(str4);
                C10147l c10147lYandex = C8662l.yandex();
                c10147lYandex.yandex = new C4816l(c1062lM2163public, strYandex, str4, c18096lAmazon);
                c10147lYandex.purchase = 1226;
                C3823l c3823lPurchase = c1062lM2163public.purchase(1, c10147lYandex.yandex());
                C7847l c7847l = new C7847l(c1062lM2163public, str4);
                c3823lPurchase.getClass();
                c3823lPurchase.amazon(AbstractC8333l.yandex, c7847l);
                c7044l.m2160finally(C14214l.yandex);
                return Unit.INSTANCE;
            case 8:
                C5073l c5073l = (C5073l) obj;
                InterfaceC12244l interfaceC12244l = c5073l.f11086l;
                c5073l.setValue(C18364l.loadAd((C18364l) interfaceC12244l.getValue(), false, false, 0, 0, AbstractC16901l.m4225interface(((C18364l) interfaceC12244l.getValue()).f35876l, (C7117l) obj2), 47));
                return Unit.INSTANCE;
            case 9:
                C10038l c10038l = (C10038l) obj;
                return C12178l.loadAd(((C7757l) c10038l.f20463l).adcel, (C8943l) ((InterfaceC1220l) c10038l.f20466l).getValue(), ((InterfaceC4920l) obj2).getAnnotations());
            case 10:
                C10038l c10038l2 = (C10038l) obj;
                return C12178l.loadAd(((C7757l) c10038l2.f20463l).adcel, (C8943l) ((InterfaceC1220l) c10038l2.f20466l).getValue(), (InterfaceC3841l) obj2);
            case 11:
                ((Function1) obj).invoke((C14593l) obj2);
                return Unit.INSTANCE;
            case 12:
                C14282l c14282l = ((C15351l) obj).adcel;
                return new C9735l(AbstractC12953l.remoteconfig(c14282l.yandex, c14282l.loadAd, AbstractC5341l.crashlytics.yandex(((Number) ((Function0) obj2).invoke()).floatValue())));
            case 13:
                C15015l c15015l = (C15015l) obj;
                String str5 = (String) obj2;
                AbstractC0601l abstractC0601l = c15015l.f29532l;
                String str6 = c15015l.f29533l;
                abstractC0601l.getClass();
                Collection collectionM4213const = str5.equals("<init>") ? AbstractC16901l.m4213const(abstractC0601l.mo654case()) : abstractC0601l.mo662switch(C3498l.purchase(str5));
                ArrayList arrayList2 = new ArrayList();
                for (Object obj4 : collectionM4213const) {
                    if (AbstractC8576l.yandex(AbstractC1653l.crashlytics((InterfaceC4884l) obj4).loadAd(), str6)) {
                        arrayList2.add(obj4);
                    }
                }
                if (arrayList2.size() == 1) {
                    return (InterfaceC4884l) AbstractC16901l.m4208abstract(arrayList2);
                }
                String strM4210case = AbstractC16901l.m4210case(collectionM4213const, "\n", null, null, C1490l.f3724l, 30);
                StringBuilder sbLicense = AbstractC14814l.license("Function '", str5, "' (JVM signature: ", str6, ") not resolved in ");
                sbLicense.append(abstractC0601l);
                sbLicense.append(':');
                sbLicense.append(strM4210case.length() == 0 ? " no members found" : "\n".concat(strM4210case));
                throw new C3150l(sbLicense.toString());
            case 14:
                C5380l c5380l = (C5380l) obj;
                Function0 function0 = (Function0) obj2;
                List listInmobi = c5380l.f11513l.inmobi();
                if (listInmobi.isEmpty()) {
                    return C2580l.f5619l;
                }
                ArrayList arrayList3 = new ArrayList(AbstractC14055l.billing(listInmobi, 10));
                int i7 = 0;
                for (Object obj5 : listInmobi) {
                    int i8 = i7 + 1;
                    if (i7 < 0) {
                        AbstractC14055l.subscription();
                        throw null;
                    }
                    AbstractC4946l abstractC4946l = (AbstractC4946l) obj5;
                    C13998l c13998l = function0 == null ? null : new C13998l(new C5139l(c5380l, 1), i7, i4);
                    if (abstractC4946l.crashlytics()) {
                        c0861lSmaato = C0861l.crashlytics;
                    } else {
                        C5380l c5380l2 = new C5380l(abstractC4946l.loadAd(), c13998l, false);
                        int iInmobi = AbstractC5020l.inmobi(abstractC4946l.yandex());
                        if (iInmobi != 0) {
                            if (iInmobi == 1) {
                                c0861l = new C0861l(2, c5380l2);
                            } else {
                                if (iInmobi != 2) {
                                    C18725l.billing();
                                    return null;
                                }
                                c0861l = new C0861l(3, c5380l2);
                            }
                            c0861lSmaato = c0861l;
                        } else {
                            C0861l c0861l2 = C0861l.crashlytics;
                            c0861lSmaato = AbstractC12953l.smaato(c5380l2);
                        }
                    }
                    arrayList3.add(c0861lSmaato);
                    i7 = i8;
                }
                return arrayList3;
            case 15:
                C11296l c11296l = (C11296l) obj;
                return AbstractC16901l.m4213const(((InterfaceC0252l) ((C0511l) c11296l.f22763l.f15738l).purchase).loadAd(c11296l.f22754l, (C16400l) obj2));
            case 16:
                C14787l c14787l = (C14787l) obj;
                c14787l.f28911l.invoke((C4530l) obj2);
                c14787l.purchase();
                return Unit.INSTANCE;
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                final C17136l c17136l = (C17136l) obj;
                final C11359l c11359l = (C11359l) obj2;
                new C17731l(R.string.eq3_preset_menu, AbstractC14055l.remoteconfig(new C2900l(R.drawable.ic_edit_outline_28, c17136l.isVip().getString(R.string.eq3_preset_menu_action_rename), new Function1() { // from class: lّؕؕ
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj6) {
                        int i9 = i4;
                        C11359l c11359l2 = c11359l;
                        C17136l c17136l2 = c17136l;
                        switch (i9) {
                            case 0:
                                c17136l2.f33322l.setValue(c11359l2);
                                break;
                            default:
                                c17136l2.f33323l.setValue(c11359l2);
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }), new C2900l(R.drawable.ic_delete_outline_android_28, c17136l.isVip().getString(R.string.eq3_preset_menu_action_delete), new Function1() { // from class: lّؕؕ
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj6) {
                        int i9 = i5;
                        C11359l c11359l2 = c11359l;
                        C17136l c17136l2 = c17136l;
                        switch (i9) {
                            case 0:
                                c17136l2.f33322l.setValue(c11359l2);
                                break;
                            default:
                                c17136l2.f33323l.setValue(c11359l2);
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }))).Signature(c17136l.isVip());
                return Unit.INSTANCE;
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                ((C0311l) obj).isVip().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(((EnumC17281l) obj2).f33526l)));
                return Unit.INSTANCE;
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                StringBuilder sb2 = new StringBuilder();
                C14654l c14654l = (C14654l) obj;
                sb2.append(c14654l.loadAd);
                sb2.append('_');
                sb2.append(c14654l.yandex);
                AbstractC8189l.billing(new C16534l(new String[]{sb2.toString()}), new C6238l(15, (C7246l) obj2));
                return Unit.INSTANCE;
            case 20:
                C5047l c5047l = new C5047l();
                Iterator it = ((AbstractC10175l) obj2).license().iterator();
                while (it.hasNext()) {
                    c5047l.add(((InterfaceC4884l) it.next()).isPro((C2201l) obj));
                }
                return c5047l;
            case 21:
                ((InterfaceC8714l) obj2).setValue((EnumC3503l) obj);
                return Unit.INSTANCE;
            case 22:
                C8050l c8050l = (C8050l) obj2;
                C4593l c4593l = (C4593l) obj;
                try {
                    if (!c4593l.yandex(true, this)) {
                        throw new IOException("Required SETTINGS preface not received");
                    }
                    while (c4593l.yandex(false, this)) {
                    }
                    c8050l.yandex(1, 9, null);
                    AbstractC7712l.loadAd(c4593l);
                    return Unit.INSTANCE;
                } catch (IOException e) {
                    c8050l.yandex(2, 2, e);
                } catch (Throwable th) {
                    c8050l.yandex(3, 3, null);
                    AbstractC7712l.loadAd(c4593l);
                    throw th;
                }
                break;
            case 23:
                C17984l c17984l = (C17984l) obj;
                AbstractC9033l.crashlytics((AppActivity) c17984l.isVip(), new C15559l((C15050l) obj2, c17984l, b == true ? 1 : 0, i3));
                return Unit.INSTANCE;
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                ((InterfaceC8714l) obj2).setValue((C15050l) obj);
                return Unit.INSTANCE;
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                return ((C7757l) ((C10038l) obj).f20463l).metrica.subs().isPro(((C1363l) obj2).yandex).ad();
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                C13518l c13518l = (C13518l) obj;
                C16412l c16412l = (C16412l) obj2;
                Function1 function1 = c13518l.loadAd;
                C10202l c10202l = c13518l.yandex;
                C5188l c5188l = new C5188l((InterfaceC8371l) function1.invoke(c10202l), C13518l.mopub, 4, 2, Collections.singletonList(c10202l.f20792l.purchase()), c16412l);
                c5188l.inmobi(new C15888l(c16412l, c5188l), C5746l.f12138l, null);
                return c5188l;
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                C6141l c6141l = (C6141l) obj;
                return new C11410l(c6141l.smaato(), (C16412l) obj2, new C7646l(25, c6141l));
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                C11410l c11410l = (C11410l) obj;
                C10202l c10202l2 = c11410l.purchase().yandex;
                C13518l.amazon.getClass();
                return AbstractC9033l.billing(c10202l2, C13518l.admob, new C12014l((C16412l) obj2, c11410l.purchase().yandex)).ad();
            default:
                C18174l c18174l = (C18174l) obj;
                C10038l c10038l3 = c18174l.f35596l;
                C7757l c7757l = (C7757l) c10038l3.f20463l;
                return new C18174l(new C10038l(new C7757l(c7757l.yandex, c7757l.loadAd, c7757l.crashlytics, c7757l.amazon, c7757l.purchase, c7757l.billing, c7757l.admob, c7757l.subs, c7757l.isPro, c7757l.firebase, c7757l.smaato, c7757l.remoteconfig, c7757l.vip, c7757l.metrica, c7757l.startapp, c7757l.adcel, c7757l.ads, c7757l.subscription, c7757l.tapsense, c7757l.Signature, c7757l.license, c7757l.pro), (InterfaceC7483l) c10038l3.f20462l, (InterfaceC1220l) c10038l3.f20466l), c18174l.Signature(), c18174l.f35592l, (InterfaceC17477l) obj2);
        }
    }

    public /* synthetic */ C0340l(Object obj, Object obj2, int i) {
        this.f1394l = i;
        this.f1392l = obj;
        this.f1393l = obj2;
    }

    public /* synthetic */ C0340l(Object obj, Object obj2, boolean z, int i) {
        this.f1394l = i;
        this.f1393l = obj;
        this.f1392l = obj2;
    }
}
