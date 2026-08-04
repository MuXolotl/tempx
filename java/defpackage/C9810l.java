package defpackage;

import android.app.Activity;
import android.util.Size;
import android.view.View;
import androidx.car.app.navigation.model.Maneuver;
import io.realm.kotlin.internal.interop.NativePointer;
import io.realm.kotlin.internal.interop.loadAd;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import ua.itaysonlab.catalogkit.objects.Catalog2Button;
import ua.itaysonlab.catalogkit.objects.Catalog2Placeholder;
import ua.itaysonlab.vkapi2.objects.music.AudioTrack;
import ua.itaysonlab.vkapi2.objects.music.catalog.CustomCatalogBlockItem;
import ua.itaysonlab.vkapi2.objects.music.playlist.AudioPlaylist;
import ua.itaysonlab.vkx.VKXApplication;
import ua.itaysonlab.vkx.activity.AppActivity;

/* JADX INFO: renamed from: lٍؙۛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C9810l implements Function0 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ Object f19984l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ Object f19985l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f19986l;

    public /* synthetic */ C9810l(Object obj, Object obj2, int i) {
        this.f19986l = i;
        this.f19985l = obj;
        this.f19984l = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:167:0x04cd  */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Catalog2Button catalog2Button;
        Object c18435l;
        Map map;
        String strPurchase;
        Object next;
        int i = this.f19986l;
        InterfaceC14029l interfaceC14029l = null;
        Object obj = this.f19984l;
        Object obj2 = this.f19985l;
        switch (i) {
            case 0:
                C12772l c12772l = new C12772l((String) obj2, 13);
                c12772l.loadAd = (String) obj;
                return c12772l;
            case 1:
                Activity activityIsVip = ((AbstractC9694l) obj2).isVip();
                List list = ((Catalog2Placeholder) obj).purchase;
                if (list == null || (catalog2Button = (Catalog2Button) AbstractC16901l.m4217extends(list)) == null) {
                    return Unit.INSTANCE;
                }
                C14100l.yandex(activityIsVip, catalog2Button);
                return Unit.INSTANCE;
            case 2:
                InterfaceC1982l interfaceC1982l = (InterfaceC1982l) obj2;
                Catalog2Button catalog2Button2 = (Catalog2Button) obj;
                String str = catalog2Button2.purchase;
                if (str == null) {
                    return Unit.INSTANCE;
                }
                String str2 = catalog2Button2.admob;
                if (str2 == null) {
                    return Unit.INSTANCE;
                }
                interfaceC1982l.Signature(new C3086l(12, str, str2, null, null), false);
                return Unit.INSTANCE;
            case 3:
                ((Function1) ((C12823l) obj2).f25198l).invoke((View) obj);
                return Unit.INSTANCE;
            case 4:
                Catalog2Button catalog2Button3 = (Catalog2Button) obj2;
                Function0 function0 = (Function0) obj;
                if (catalog2Button3.purchase != null) {
                    String str3 = catalog2Button3.billing;
                    if (str3 != null) {
                        try {
                            C17963l c17963l = new C17963l();
                            C15913l c15913l = AbstractC8237l.amazon;
                            c15913l.getClass();
                            for (Map.Entry entry : ((C18010l) c15913l.loadAd(C18010l.Companion.serializer(), str3)).f35200l.entrySet()) {
                                String str4 = (String) entry.getKey();
                                AbstractC9914l abstractC9914l = (AbstractC9914l) entry.getValue();
                                if (abstractC9914l instanceof AbstractC18121l) {
                                    String strPurchase2 = AbstractC8358l.purchase(AbstractC8358l.admob(abstractC9914l));
                                    if (strPurchase2 != null) {
                                        c17963l.put(str4, strPurchase2);
                                    }
                                } else if (abstractC9914l instanceof C18427l) {
                                    C11474l c11474l = AbstractC8358l.yandex;
                                    AbstractC9914l abstractC9914l2 = (AbstractC9914l) AbstractC16901l.m4217extends((C18427l) abstractC9914l);
                                    if (abstractC9914l2 != null && (strPurchase = AbstractC8358l.purchase(AbstractC8358l.admob(abstractC9914l2))) != null) {
                                        c17963l.put(str4, strPurchase);
                                    }
                                }
                            }
                            c18435l = c17963l.crashlytics();
                        } catch (Throwable th) {
                            c18435l = new C18435l(th);
                        }
                        Throwable thYandex = C1171l.yandex(c18435l);
                        if (thYandex != null) {
                            thYandex.printStackTrace();
                        }
                        map = (Map) (c18435l instanceof C18435l ? null : c18435l);
                        if (map == null) {
                            map = C14054l.f27396l;
                        }
                    } else {
                        map = C14054l.f27396l;
                    }
                    ((InterfaceC1982l) function0.invoke()).Signature(new C3086l(10, catalog2Button3.purchase, null, null, map), false);
                    break;
                }
                return Unit.INSTANCE;
            case 5:
                AudioPlaylist audioPlaylist = (AudioPlaylist) obj;
                ((InterfaceC1982l) ((Function0) obj2).invoke()).Signature(new C11827l(AbstractC14770l.remoteconfig(audioPlaylist), audioPlaylist.mopub), false);
                return Unit.INSTANCE;
            case 6:
                ((Function1) obj2).invoke((CustomCatalogBlockItem) obj);
                return Unit.INSTANCE;
            case 7:
                AbstractC6139l abstractC6139l = (AbstractC6139l) obj;
                return new C6067l(abstractC6139l, (NativePointer) loadAd.purchase(((C12125l) obj2).yandex(), (NativePointer) abstractC6139l.f12924l.f5290l).f17098l);
            case 8:
                C11249l c11249l = (C11249l) obj;
                new C18534l((C16016l) obj2, null).Signature(c11249l.f5081l);
                c11249l.purchase();
                return Unit.INSTANCE;
            case 9:
                C10244l.purchase.loadAd(new C17685l((AudioPlaylist) obj2, (List) obj, ""));
                return Unit.INSTANCE;
            case 10:
                List list2 = (List) obj;
                C10244l.purchase.loadAd(new C4778l(String.valueOf(list2.hashCode()), (String) obj2, list2));
                return Unit.INSTANCE;
            case 11:
                C18449l c18449l = (C18449l) obj;
                String str5 = (String) c18449l.f36010l;
                InterfaceC15879l interfaceC15879l = (InterfaceC15879l) c18449l.f36009l;
                InterfaceC13662l interfaceC13662lYandex = ((C4835l) obj2).yandex(str5);
                if (interfaceC13662lYandex == null) {
                    return new C14444l();
                }
                Set setLoadAd = interfaceC15879l.loadAd();
                if (setLoadAd.isEmpty()) {
                    return new C14444l();
                }
                LinkedHashMap linkedHashMap = AbstractC15040l.yandex;
                String str6 = AbstractC11631l.yandex;
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                for (Map.Entry entry2 : ((Map) AbstractC11631l.mopub.getValue()).entrySet()) {
                    C15421l c15421l = (C15421l) entry2.getKey();
                    C13672l c13672l = (C13672l) entry2.getValue();
                    c13672l.getClass();
                    ArrayList arrayList = new ArrayList();
                    Iterator it = c13672l.yandex.values().iterator();
                    while (it.hasNext()) {
                        Set set = (Set) ((Map) it.next()).get(str5);
                        if (set != null) {
                            arrayList.addAll(set);
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        linkedHashSet.add(c15421l);
                    }
                }
                LinkedHashSet linkedHashSetM4244throw = AbstractC16901l.m4244throw(setLoadAd, linkedHashSet);
                if (linkedHashSetM4244throw.isEmpty()) {
                    return new C14444l();
                }
                List listAppmetrica = interfaceC15879l.appmetrica(34);
                HashSet hashSet = new HashSet(AbstractC2200l.firebase(AbstractC14055l.billing(listAppmetrica, 12)));
                AbstractC16901l.m4235protected(listAppmetrica, hashSet);
                C18680l c18680l = C18680l.purchase;
                ArrayList arrayList2 = new ArrayList(C18680l.remoteconfig);
                ArrayList<C18680l> arrayList3 = new ArrayList();
                for (Object obj3 : arrayList2) {
                    if (obj3 instanceof C18680l) {
                        arrayList3.add(obj3);
                    }
                }
                ArrayList arrayList4 = new ArrayList();
                for (C18680l c18680l2 : arrayList3) {
                    Iterator it2 = c18680l2.amazon.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            next = it2.next();
                            Size size = (Size) next;
                            if (!hashSet.contains(size) || !interfaceC13662lYandex.mo1973l(size.getWidth(), size.getHeight())) {
                            }
                        } else {
                            next = null;
                        }
                    }
                    Size size2 = (Size) next;
                    C8195l c8195l = size2 != null ? new C8195l(c18680l2, size2) : null;
                    if (c8195l != null) {
                        arrayList4.add(c8195l);
                    }
                }
                Map mapSubscription = AbstractC8676l.subscription(arrayList4);
                return mapSubscription.isEmpty() ? new C14444l() : new C14444l(linkedHashSetM4244throw, mapSubscription);
            case 12:
                ((C16385l) obj2).m4125private(new C16042l((C14286l) obj));
                return Unit.INSTANCE;
            case 13:
                C16385l c16385l = (C16385l) obj2;
                c16385l.f32036l.setValue(Boolean.valueOf(!c16385l.m4174const()));
                C11897l c11897l = AbstractC0968l.amazon;
                c11897l.loadAd(Boolean.valueOf(!((Boolean) c11897l.yandex()).booleanValue()));
                c16385l.f32038l.setValue(Boolean.FALSE);
                ((Function0) obj).invoke();
                return Unit.INSTANCE;
            case 14:
                ((C9502l) obj2).m4125private(new C2169l((C13884l) obj));
                return Unit.INSTANCE;
            case 15:
                C9502l c9502l = (C9502l) obj2;
                C10086l c10086l = c9502l.f19381l;
                c10086l.setValue(Boolean.valueOf(!((Boolean) c10086l.getValue()).booleanValue()));
                C11897l c11897l2 = AbstractC0968l.purchase;
                c11897l2.loadAd(Boolean.valueOf(!((Boolean) c11897l2.yandex()).booleanValue()));
                c9502l.f19382l.setValue(Boolean.FALSE);
                ((Function0) obj).invoke();
                return Unit.INSTANCE;
            case 16:
                C16385l c16385l2 = (C16385l) obj2;
                c16385l2.f32036l.setValue(Boolean.valueOf(!c16385l2.m4177return()));
                C11897l c11897l3 = AbstractC0968l.loadAd;
                c11897l3.loadAd(Boolean.valueOf(!((Boolean) c11897l3.yandex()).booleanValue()));
                c16385l2.f32038l.setValue(Boolean.FALSE);
                ((Function0) obj).invoke();
                return Unit.INSTANCE;
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                C16385l c16385l3 = (C16385l) obj2;
                Activity activityIsVip2 = c16385l3.isVip();
                C13099l c13099l = new C13099l((InterfaceC13238l) c16385l3.f22963l.getValue());
                String strValueOf = String.valueOf(((C16820l) obj).yandex);
                AbstractC9092l.loadAd(activityIsVip2, c13099l, new C13305l(strValueOf != null ? new C11392l(strValueOf) : C4618l.yandex, 0L, null, false, false, false, 126));
                return Unit.INSTANCE;
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                C15478l c15478l = C15478l.purchase;
                C9808l c9808l = new C9808l((AudioTrack) obj);
                c15478l.getClass();
                C15478l.loadAd((AppActivity) obj2, c9808l);
                return Unit.INSTANCE;
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                C12689l c12689l = (C12689l) obj;
                if (((C12633l) ((C18449l) obj2).f36010l).get() == 0) {
                    c12689l.invoke();
                }
                return Unit.INSTANCE;
            case 20:
                ((Function0) obj2).invoke();
                ((InterfaceC8714l) obj).setValue(Boolean.FALSE);
                return Unit.INSTANCE;
            case 21:
                ((Function1) obj2).invoke((C10507l) obj);
                return Unit.INSTANCE;
            case 22:
                ((Function1) obj2).invoke(Integer.valueOf((int) ((C13765l) obj).admob()));
                return Unit.INSTANCE;
            case 23:
                return "Only found " + ((C9987l) obj2).f20387l + " digits in a row, but need to parse " + ((C6994l) obj).loadAd();
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                C11749l c11749l = (C11749l) obj2;
                C4862l c4862l = (C4862l) obj;
                Activity activity = c11749l.f5081l;
                AppActivity appActivity = activity instanceof AppActivity ? (AppActivity) activity : null;
                if (appActivity != null) {
                    appActivity.license(new C17398l(c4862l.yandex, 8, c4862l.loadAd, c4862l.crashlytics));
                }
                c11749l.purchase();
                return Unit.INSTANCE;
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                C11749l c11749l2 = (C11749l) obj2;
                AbstractC9033l.crashlytics((AppActivity) c11749l2.f5081l, new C3491l(c11749l2, (C6001l) obj, null));
                return Unit.INSTANCE;
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                String str7 = (String) obj2;
                C5301l c5301l = (C5301l) obj;
                C16015l c16015l = C16015l.purchase;
                InterfaceC18035l[] interfaceC18035lArr = new InterfaceC18035l[0];
                if (AbstractC12024l.m3315catch(str7)) {
                    C8339l.metrica("Blank serial names are prohibited");
                } else {
                    if (c16015l != C16015l.amazon) {
                        C14416l c14416l = new C14416l(str7);
                        c14416l.loadAd = (List) c5301l.crashlytics;
                        Unit unit = Unit.INSTANCE;
                        return new C16413l(str7, c16015l, c14416l.crashlytics.size(), AbstractC8669l.m2415super(interfaceC18035lArr), c14416l);
                    }
                    C8339l.metrica("For StructureKind.CLASS please use 'buildClassSerialDescriptor' instead");
                }
                return null;
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                List list3 = (List) obj2;
                C7711l c7711l = (C7711l) obj;
                ArrayList arrayList5 = new ArrayList(AbstractC14055l.billing(list3, 10));
                Iterator it3 = list3.iterator();
                while (it3.hasNext()) {
                    arrayList5.add(AbstractC16676l.mopub((AudioTrack) it3.next()));
                }
                C16534l c16534l = new C16534l(arrayList5);
                C3787l c3787l = new C3787l(c7711l, 6);
                VKXApplication vKXApplication = VKXApplication.f36631l;
                if (vKXApplication == null) {
                    vKXApplication = null;
                }
                AbstractC10999l.mopub(vKXApplication, null, 0, new C5163l(c16534l, c3787l, interfaceC14029l, 11), 3);
                return Unit.INSTANCE;
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                return AbstractC7572l.license(2, (InterfaceC12932l) obj2, C1732l.f4136l, new C5888l((AbstractC8870l) obj, interfaceC14029l, 15)).yandex;
            default:
                C17284l c17284l = (C17284l) obj2;
                c17284l.f33542l.setValue(Boolean.FALSE);
                c17284l.f33538l.smaato((EnumC17214l) obj);
                return Unit.INSTANCE;
        }
    }
}
