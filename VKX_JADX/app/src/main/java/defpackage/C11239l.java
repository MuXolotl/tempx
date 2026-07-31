package defpackage;

import android.app.Activity;
import android.database.ContentObserver;
import android.view.View;
import androidx.car.app.navigation.model.Maneuver;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import ua.itaysonlab.vkapi2.objects.music.AudioTrack;
import ua.itaysonlab.vkapi2.objects.users.VKProfile;

/* JADX INFO: renamed from: lٍُۖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C11239l implements Function0 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final Object f22623l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final Object f22624l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f22625l;

    public C11239l(AbstractC8028l abstractC8028l, C0865l c0865l, C10700l c10700l) {
        this.f22625l = 5;
        this.f22624l = abstractC8028l;
        this.f22623l = c10700l;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v21, types: [int] */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r10v1, types: [lًؘٖ, lٔۤٓ] */
    /* JADX WARN: Type inference failed for: r11v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r11v6, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r11v7, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r12v3, types: [lٕٜؖ, lؘٚٓ, lٌَؑ] */
    /* JADX WARN: Type inference failed for: r13v7, types: [int] */
    /* JADX WARN: Type inference failed for: r8v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v8 */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        ArrayList arrayList;
        boolean z;
        List listVip;
        ?? arrayList2;
        ?? r8;
        C8195l c8195l;
        Activity activity;
        String str;
        C2201l c2201lAmazon;
        int i = this.f22625l;
        InterfaceC11805l c11392l = C4618l.yandex;
        List listAmazon = C2580l.f5619l;
        boolean z2 = false;
        InterfaceC14029l interfaceC14029l = null;
        Object obj = this.f22623l;
        Object obj2 = this.f22624l;
        switch (i) {
            case 0:
                C5160l c5160l = (C5160l) obj;
                InterfaceC15234l interfaceC15234lPro = ((AbstractC18041l) obj2).mo1339native().pro();
                if (interfaceC15234lPro instanceof InterfaceC17477l) {
                    Class clsMetrica = AbstractC5592l.metrica((InterfaceC17477l) interfaceC15234lPro);
                    if (clsMetrica != null) {
                        Class cls = c5160l.f11212l;
                        if (AbstractC8576l.yandex(cls.getSuperclass(), clsMetrica)) {
                            return cls.getGenericSuperclass();
                        }
                        int iM2398catch = AbstractC8669l.m2398catch(clsMetrica, cls.getInterfaces());
                        if (iM2398catch >= 0) {
                            return cls.getGenericInterfaces()[iM2398catch];
                        }
                        C17132l.adcel("No superclass of ", c5160l, " in Java reflection for ", interfaceC15234lPro);
                    } else {
                        C17132l.adcel("Unsupported superclass of ", c5160l, ": ", interfaceC15234lPro);
                    }
                } else {
                    C11467l.Signature(interfaceC15234lPro, "Supertype not a class: ");
                }
                return null;
            case 1:
                C7474l c7474l = (C7474l) obj2;
                C12843l c12843l = (C12843l) obj;
                C4258l c4258l = c7474l.f15472l.crashlytics;
                return AbstractC10392l.metrica(c4258l != null ? c4258l : null, c7474l.f15473l.ad().mo1730private().getClassLoader(), c12843l, new C8467l(2, c7474l));
            case 2:
                ?? r10 = (C15284l) obj2;
                C10038l c10038l = (C10038l) obj;
                C3199l c3199l = C2782l.f6058l;
                C12875l c12875l = r10.metrica;
                C10038l c10038l2 = r10.loadAd;
                InterfaceC17477l interfaceC17477l = r10.vip;
                List listAdcel = AbstractC17587l.adcel(new C11100l(AbstractC17587l.smaato(AbstractC8669l.ads(c12875l.yandex.getDeclaredConstructors()), C10849l.f21912l), C9855l.f20065l));
                ArrayList arrayList3 = new ArrayList(listAdcel.size());
                Iterator it = listAdcel.iterator();
                while (it.hasNext()) {
                    C17140l c17140l = (C17140l) it.next();
                    C4142l c4142lM1502l = C4142l.m1502l(interfaceC17477l, AbstractC12081l.billing(c10038l2, c17140l), z2, ((C7757l) c10038l2.f20463l).isPro.startapp(c17140l));
                    C10038l c10038lPurchase = AbstractC14460l.purchase(c10038l2, c4142lM1502l, c17140l, interfaceC17477l.isVip().size(), (InterfaceC1220l) c10038l2.f20466l);
                    Constructor constructor = c17140l.yandex;
                    Type[] genericParameterTypes = constructor.getGenericParameterTypes();
                    if (genericParameterTypes.length != 0) {
                        Class declaringClass = constructor.getDeclaringClass();
                        if (declaringClass.getDeclaringClass() != null && !Modifier.isStatic(declaringClass.getModifiers())) {
                            genericParameterTypes = (Type[]) AbstractC8669l.m2419throws(1, genericParameterTypes.length, genericParameterTypes);
                        }
                        Annotation[][] parameterAnnotations = constructor.getParameterAnnotations();
                        if (parameterAnnotations.length < genericParameterTypes.length) {
                            C11983l.ad(constructor, "Illegal generic signature: ");
                            return null;
                        }
                        if (parameterAnnotations.length > genericParameterTypes.length) {
                            parameterAnnotations = (Annotation[][]) AbstractC8669l.m2419throws(parameterAnnotations.length - genericParameterTypes.length, parameterAnnotations.length, parameterAnnotations);
                        }
                        listAmazon = c17140l.amazon(genericParameterTypes, parameterAnnotations, constructor.isVarArgs());
                    }
                    C4300l c4300lSignature = AbstractC8028l.Signature(c10038lPurchase, c4142lM1502l, listAmazon);
                    List listIsVip = interfaceC17477l.isVip();
                    ArrayList typeParameters = c17140l.getTypeParameters();
                    Iterator it2 = it;
                    ArrayList arrayList4 = new ArrayList(AbstractC14055l.billing(typeParameters, 10));
                    Iterator it3 = typeParameters.iterator();
                    while (it3.hasNext()) {
                        arrayList4.add(((InterfaceC7483l) c10038lPurchase.f20462l).startapp((C16765l) it3.next()));
                    }
                    c4142lM1502l.m1856l(c4300lSignature.loadAd, AbstractC15901l.subs(c17140l.purchase()), AbstractC16901l.m4232new(listIsVip, arrayList4));
                    c4142lM1502l.mo1504l(false);
                    c4142lM1502l.mo1503l(c4300lSignature.crashlytics);
                    c4142lM1502l.m2900l(interfaceC17477l.ad());
                    ((C7757l) c10038lPurchase.f20463l).mopub.getClass();
                    arrayList3.add(c4142lM1502l);
                    it = it2;
                    listAmazon = listAmazon;
                    z2 = false;
                }
                boolean zMopub = c12875l.mopub();
                Class cls2 = c12875l.yandex;
                if (zMopub) {
                    C4142l c4142lM1502l2 = C4142l.m1502l(interfaceC17477l, c3199l, true, ((C7757l) c10038l2.f20463l).isPro.startapp(c12875l));
                    ArrayList arrayListBilling = c12875l.billing();
                    ArrayList arrayList5 = new ArrayList(arrayListBilling.size());
                    C9188l c9188lPurchase = AbstractC1135l.purchase(2, false, null, 6);
                    int i2 = 0;
                    for (Iterator it4 = arrayListBilling.iterator(); it4.hasNext(); it4 = it4) {
                        C8571l c8571l = (C8571l) it4.next();
                        arrayList5.add(new C17538l(c4142lM1502l2, null, i2, c3199l, c8571l.crashlytics(), ((C18449l) c10038l2.f20465l).m4556this(c8571l.billing(), c9188lPurchase), false, false, false, null, ((C7757l) c10038l2.f20463l).isPro.startapp(c8571l)));
                        arrayList3 = arrayList3;
                        i2++;
                        c9188lPurchase = c9188lPurchase;
                    }
                    arrayList = arrayList3;
                    z = true;
                    c4142lM1502l2.mo1503l(false);
                    C6561l c6561lAdmob = interfaceC17477l.admob();
                    if (c6561lAdmob.equals(AbstractC8009l.loadAd)) {
                        c6561lAdmob = AbstractC8009l.crashlytics;
                    }
                    c4142lM1502l2.m1860l(arrayList5, c6561lAdmob);
                    c4142lM1502l2.mo1504l(false);
                    c4142lM1502l2.m2900l(interfaceC17477l.ad());
                    int i3 = 2;
                    String strLoadAd = AbstractC17860l.loadAd(c4142lM1502l2, 2);
                    if (arrayList.isEmpty()) {
                        arrayList.add(c4142lM1502l2);
                        ((C7757l) c10038l.f20463l).mopub.getClass();
                    } else {
                        Iterator it5 = arrayList.iterator();
                        while (true) {
                            if (!it5.hasNext()) {
                                arrayList.add(c4142lM1502l2);
                                ((C7757l) c10038l.f20463l).mopub.getClass();
                            } else if (!AbstractC17860l.loadAd((C5786l) it5.next(), i3).equals(strLoadAd)) {
                                i3 = 2;
                            }
                        }
                    }
                } else {
                    arrayList = arrayList3;
                    z = true;
                }
                ((C13772l) ((C7757l) c10038l.f20463l).ad).getClass();
                C9912l c9912l = ((C7757l) c10038l.f20463l).ads;
                if (arrayList.isEmpty()) {
                    boolean zIsAnnotation = cls2.isAnnotation();
                    if (!cls2.isInterface()) {
                        c12875l.getClass();
                    }
                    if (zIsAnnotation) {
                        C7757l c7757l = (C7757l) c10038l2.f20463l;
                        C18449l c18449l = (C18449l) c10038l2.f20465l;
                        ?? M1502l = C4142l.m1502l(interfaceC17477l, c3199l, z, c7757l.isPro.startapp(c12875l));
                        if (zIsAnnotation) {
                            List listAmazon2 = c12875l.amazon();
                            arrayList2 = new ArrayList(listAmazon2.size());
                            C9188l c9188lPurchase2 = AbstractC1135l.purchase(2, z, null, 6);
                            ArrayList arrayList6 = new ArrayList();
                            ArrayList<C1734l> arrayList7 = new ArrayList();
                            for (Object obj3 : listAmazon2) {
                                if (AbstractC8576l.yandex(((C1734l) obj3).crashlytics(), AbstractC6830l.loadAd)) {
                                    arrayList6.add(obj3);
                                } else {
                                    arrayList7.add(obj3);
                                }
                            }
                            arrayList6.size();
                            C1734l c1734l = (C1734l) AbstractC16901l.m4217extends(arrayList6);
                            if (c1734l != null) {
                                AbstractC11072l abstractC11072lBilling = c1734l.billing();
                                if (abstractC11072lBilling instanceof C12681l) {
                                    C12681l c12681l = (C12681l) abstractC11072lBilling;
                                    c8195l = new C8195l(c18449l.m4542finally(c12681l, c9188lPurchase2, z), c18449l.m4556this(c12681l.loadAd, c9188lPurchase2));
                                } else {
                                    c8195l = new C8195l(c18449l.m4556this(abstractC11072lBilling, c9188lPurchase2), null);
                                }
                                r10.license(arrayList2, M1502l, 0, c1734l, (AbstractC18041l) c8195l.f17098l, (AbstractC18041l) c8195l.f17097l);
                            }
                            ?? r0 = c1734l != null ? z : 0;
                            int i4 = 0;
                            for (C1734l c1734l2 : arrayList7) {
                                r10.license(arrayList2, M1502l, i4 + r0, c1734l2, c18449l.m4556this(c1734l2.billing(), c9188lPurchase2), null);
                                i4++;
                            }
                        } else {
                            arrayList2 = Collections.EMPTY_LIST;
                        }
                        M1502l.mo1503l(false);
                        C6561l c6561lAdmob2 = interfaceC17477l.admob();
                        if (c6561lAdmob2.equals(AbstractC8009l.loadAd)) {
                            c6561lAdmob2 = AbstractC8009l.crashlytics;
                        }
                        M1502l.m1860l(arrayList2, c6561lAdmob2);
                        M1502l.mo1504l(z);
                        M1502l.m2900l(interfaceC17477l.ad());
                        ((C7757l) c10038l2.f20463l).mopub.getClass();
                        r8 = M1502l;
                    } else {
                        r8 = 0;
                    }
                    listVip = AbstractC14055l.vip(r8);
                } else {
                    listVip = arrayList;
                }
                return AbstractC16901l.m4213const(c9912l.metrica(c10038l, listVip));
            case 3:
                return new C16760l(((C15610l) obj2).yandex, (C1553l) obj);
            case 4:
                C5008l c5008l = ((C7757l) ((C10038l) obj2).f20463l).loadAd;
                ((C7676l) obj).metrica.getClass();
                c5008l.getClass();
                return null;
            case 5:
                C1461l c1461l = ((C7757l) ((AbstractC8028l) obj2).loadAd.f20463l).admob;
                c1461l.getClass();
                return null;
            case 6:
                InterfaceC13789l interfaceC13789l = (InterfaceC13789l) ((C15013l) obj).f29528l.invoke();
                ((C14945l) obj2).getClass();
                return (AbstractC18041l) interfaceC13789l;
            case 7:
                Function1 function1 = ((C2900l) obj2).crashlytics;
                C17731l c17731l = (C17731l) obj;
                Function0 function0 = c17731l.f34549l;
                if (function0 == null || (activity = (Activity) function0.invoke()) == null) {
                    activity = c17731l.f5081l;
                }
                function1.invoke(activity);
                c17731l.purchase();
                return Unit.INSTANCE;
            case 8:
                new C9174l((AudioTrack) obj2).Signature(((C0228l) obj).f5081l);
                return Unit.INSTANCE;
            case 9:
                ((C2169l) obj2).m4125private(new C16042l((C14286l) obj));
                return Unit.INSTANCE;
            case 10:
                C2169l c2169l = (C2169l) obj2;
                Activity activityIsVip = c2169l.isVip();
                C13099l c13099l = new C13099l((InterfaceC13238l) c2169l.f4812l.getValue());
                String strValueOf = String.valueOf(((C16820l) obj).yandex);
                if (strValueOf != null) {
                    c11392l = new C11392l(strValueOf);
                }
                AbstractC9092l.loadAd(activityIsVip, c13099l, new C13305l(c11392l, 0L, null, false, false, false, 126));
                return Unit.INSTANCE;
            case 11:
                C16042l c16042l = (C16042l) obj2;
                Activity activityIsVip2 = c16042l.isVip();
                C13099l c13099l2 = new C13099l((InterfaceC13238l) c16042l.f31434l.getValue());
                String strValueOf2 = String.valueOf(((C16820l) obj).yandex);
                if (strValueOf2 != null) {
                    c11392l = new C11392l(strValueOf2);
                }
                AbstractC9092l.loadAd(activityIsVip2, c13099l2, new C13305l(c11392l, 0L, null, false, false, false, 126));
                return Unit.INSTANCE;
            case 12:
                C14945l c14945l = (C14945l) obj;
                List list = (List) ((C2314l) obj2).f5026l.getValue();
                if (list != null) {
                    listAmazon = list;
                }
                ArrayList arrayList8 = new ArrayList(AbstractC14055l.billing(listAmazon, 10));
                Iterator it6 = listAmazon.iterator();
                while (it6.hasNext()) {
                    arrayList8.add(((AbstractC14318l) it6.next()).mo1else(c14945l));
                }
                return arrayList8;
            case 13:
                C17408l c17408l = (C17408l) obj2;
                c17408l.m4324finally(false);
                AbstractC10999l.mopub(AbstractC11990l.firebase(c17408l), null, 0, new C8912l((EnumC0972l) obj, interfaceC14029l, 26), 3);
                return Unit.INSTANCE;
            case 14:
                ((Function1) obj2).invoke((EnumC11215l) obj);
                return Unit.INSTANCE;
            case 15:
                AbstractC17948l.admob((View) obj2, ((C18554l) ((InterfaceC12244l) obj).getValue()).f36219l);
                return Unit.INSTANCE;
            case 16:
                ((Function1) obj2).invoke((C10507l) obj);
                return Unit.INSTANCE;
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                ((C17284l) obj2).f33539l.smaato((EnumC9736l) obj);
                return Unit.INSTANCE;
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                C17284l c17284l = (C17284l) obj2;
                AbstractC10999l.mopub(AbstractC11990l.firebase(c17284l), null, 0, new C5888l((C8643l) obj, c17284l, interfaceC14029l, 17), 3);
                return Unit.INSTANCE;
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                AudioTrack audioTrack = (AudioTrack) obj;
                ((C0471l) obj2).m4125private(new C6038l(audioTrack.loadAd, audioTrack.crashlytics));
                return Unit.INSTANCE;
            case 20:
                C4261l c4261l = (C4261l) obj2;
                VKProfile vKProfile = (VKProfile) obj;
                String str2 = vKProfile.purchase;
                c4261l.m4125private(new C0599l((str2 == null || str2.length() == 0) ? vKProfile.yandex : -vKProfile.yandex, vKProfile.amazon, vKProfile.yandex()));
                return Unit.INSTANCE;
            case 21:
                C1253l c1253l = (C1253l) obj2;
                C6388l c6388l = (C6388l) obj;
                if (c1253l.f3279l == null && !((Boolean) c1253l.f3278l.getValue()).booleanValue() && (str = c6388l.crashlytics) != null && str.length() != 0) {
                    c1253l.f3279l = AbstractC10999l.mopub(c1253l, AbstractC11463l.yandex, 0, new C6658l(c1253l, c6388l, (InterfaceC14029l) null), 2);
                }
                return Unit.INSTANCE;
            case 22:
                ((C18574l) obj2).yandex.unregisterContentObserver((ContentObserver) obj);
                return Unit.INSTANCE;
            case 23:
                new C0130l(null, (C9894l) obj2, 7).Signature(((C12457l) obj).isVip());
                return Unit.INSTANCE;
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                new C0130l((C6417l) obj2, null, 11).Signature(((C9169l) obj).isVip());
                return Unit.INSTANCE;
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                ((C8316l) obj2).loadAd.invoke((EnumC0756l) obj);
                return Unit.INSTANCE;
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                ((C6922l) obj2).loadAd.invoke((C16895l) obj);
                return Unit.INSTANCE;
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                new C14476l((C8188l) obj2).Signature(((C13888l) obj).isVip());
                return Unit.INSTANCE;
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                C7871l c7871l = (C7871l) obj2;
                C5786l c5786l = (C5786l) obj;
                C16412l c16412l = c7871l.f16421l;
                C9522l c9522l = c7871l.f16422l;
                InterfaceC3841l annotations = c5786l.getAnnotations();
                C5786l c5786l2 = c5786l;
                int iMo367while = c5786l2.mo367while();
                C9522l c9522l2 = c7871l.f16422l;
                C7871l c7871l2 = new C7871l(c16412l, c9522l, c5786l, c7871l, annotations, iMo367while, c9522l2.billing());
                C7871l.f16419l.getClass();
                if (c9522l2.m2677l() == null) {
                    c2201lAmazon = null;
                } else {
                    AbstractC15211l abstractC15211l = c9522l2.f19410l;
                    if (abstractC15211l == null) {
                        abstractC15211l = null;
                    }
                    c2201lAmazon = C2201l.amazon(abstractC15211l);
                }
                if (c2201lAmazon == null) {
                    return null;
                }
                C7073l c7073l = c5786l2.f20729l;
                C7073l c7073lIsPro = c7073l != null ? c7073l.isPro(c2201lAmazon) : null;
                List listMo1478l = c5786l2.mo1478l();
                ArrayList arrayList9 = new ArrayList(AbstractC14055l.billing(listMo1478l, 10));
                Iterator it7 = listMo1478l.iterator();
                while (it7.hasNext()) {
                    arrayList9.add(((C7073l) it7.next()).isPro(c2201lAmazon));
                }
                List list2 = c9522l2.f19409l;
                c7871l2.mo2896l(null, c7073lIsPro, arrayList9, list2 == null ? null : list2, c7871l.mo1007finally(), c7871l.f20715l, 1, c9522l2.f19408l);
                return c7871l2;
            default:
                C7644l c7644l = (C7644l) ((C15615l) obj2).f30483l;
                return ((InterfaceC0252l) ((C0511l) c7644l.f15738l).purchase).amazon((C18128l) obj, (InterfaceC3588l) c7644l.f15737l);
        }
    }

    public /* synthetic */ C11239l(Object obj, Object obj2, int i) {
        this.f22625l = i;
        this.f22624l = obj;
        this.f22623l = obj2;
    }
}
