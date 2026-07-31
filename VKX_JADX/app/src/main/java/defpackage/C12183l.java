package defpackage;

import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProviderInfo;
import android.content.ComponentName;
import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;

/* JADX INFO: renamed from: lِۡ٘, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C12183l {
    public static final C3067l amazon;
    public static InterfaceC15829l billing;
    public static final C16033l mopub;
    public static final C6286l purchase;
    public final C8688l crashlytics = new C8688l(new C7730l(5, this));
    public final AppWidgetManager loadAd;
    public final Context yandex;

    static {
        C3067l c3067l = new C3067l();
        amazon = c3067l;
        purchase = AbstractC3925l.crashlytics("GlanceAppWidgetManager-" + C3067l.yandex(c3067l), null, null, 14);
        mopub = new C16033l("list::Providers");
    }

    public C12183l(Context context) {
        this.yandex = context;
        this.loadAd = AppWidgetManager.getInstance(context);
    }

    public final Object amazon(AbstractC12866l abstractC12866l, AbstractC5518l abstractC5518l, C15559l c15559l) {
        amazon.getClass();
        String canonicalName = abstractC12866l.getClass().getCanonicalName();
        InterfaceC14029l interfaceC14029l = null;
        if (canonicalName == null) {
            C8339l.metrica("no receiver name");
            return null;
        }
        String canonicalName2 = abstractC5518l.getClass().getCanonicalName();
        if (canonicalName2 != null) {
            Object objLoadAd = ((InterfaceC15829l) this.crashlytics.getValue()).loadAd(new C11281l(canonicalName, canonicalName2, interfaceC14029l, 0), c15559l);
            return objLoadAd == EnumC9342l.f19165l ? objLoadAd : Unit.INSTANCE;
        }
        C8339l.metrica("no provider name");
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:48:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:50:0x0105  */
    /* JADX WARN: Code duplicated, block: B:53:0x0116  */
    /* JADX WARN: Code duplicated, block: B:55:0x012d  */
    /* JADX WARN: Code duplicated, block: B:56:0x012f  */
    /* JADX WARN: Code duplicated, block: B:62:0x0155  */
    /* JADX WARN: Code duplicated, block: B:64:0x0167  */
    /* JADX WARN: Code duplicated, block: B:69:0x0136 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:0x0110 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:75:0x016f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object crashlytics(AbstractC0283l abstractC0283l) throws IllegalAccessException, InstantiationException, InvocationTargetException {
        C8925l c8925l;
        C12183l c12183l;
        C16221l c16221l;
        C12183l c12183l2;
        String packageName;
        Set<String> set;
        ArrayList arrayList;
        LinkedHashMap linkedHashMap;
        String str;
        Object arrayList2;
        ComponentName componentName;
        String str2;
        C8195l c8195l;
        if (abstractC0283l instanceof C8925l) {
            c8925l = (C8925l) abstractC0283l;
            int i = c8925l.f18394l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c8925l.f18394l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c8925l = new C8925l(this, abstractC0283l);
            }
        } else {
            c8925l = new C8925l(this, abstractC0283l);
        }
        Object objFirebase = c8925l.f18395l;
        int i2 = c8925l.f18394l;
        C8688l c8688l = this.crashlytics;
        C3067l c3067l = amazon;
        C16033l c16033l = mopub;
        InterfaceC14029l interfaceC14029l = null;
        EnumC9342l enumC9342l = EnumC9342l.f19165l;
        if (i2 == 0) {
            AbstractC2829l.crashlytics(objFirebase);
            InterfaceC6942l interfaceC6942lYandex = ((InterfaceC15829l) c8688l.getValue()).yandex();
            c8925l.f18396l = this;
            c8925l.f18394l = 1;
            objFirebase = AbstractC0622l.firebase(interfaceC6942lYandex, c8925l);
            if (objFirebase != enumC9342l) {
                c12183l = this;
            }
            return enumC9342l;
        }
        if (i2 == 1) {
            c12183l = c8925l.f18396l;
            AbstractC2829l.crashlytics(objFirebase);
        } else {
            if (i2 != 2) {
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            c12183l2 = c8925l.f18396l;
            AbstractC2829l.crashlytics(objFirebase);
        }
        c16221l = (C16221l) objFirebase;
        c12183l = c12183l2;
        packageName = c12183l.yandex.getPackageName();
        set = (Set) c16221l.crashlytics(c16033l);
        if (set == null) {
            C14054l c14054l = C14054l.f27396l;
            return new C4808l(c14054l, c14054l);
        }
        arrayList = new ArrayList();
        for (String str3 : set) {
            componentName = new ComponentName(packageName, str3);
            str2 = (String) c16221l.crashlytics(C3067l.loadAd(c3067l, str3));
            if (str2 == null) {
                c8195l = null;
            } else {
                c8195l = new C8195l(componentName, str2);
            }
            if (c8195l != null) {
                arrayList.add(c8195l);
            }
        }
        Map mapSubscription = AbstractC8676l.subscription(arrayList);
        Set<Map.Entry> setEntrySet = mapSubscription.entrySet();
        linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : setEntrySet) {
            str = (String) entry.getValue();
            arrayList2 = linkedHashMap.get(str);
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                linkedHashMap.put(str, arrayList2);
            }
            ((List) arrayList2).add((ComponentName) entry.getKey());
        }
        return new C4808l(mapSubscription, linkedHashMap);
        if (((C16221l) objFirebase).crashlytics(c16033l) == null) {
            objFirebase = null;
        }
        c16221l = (C16221l) objFirebase;
        if (c16221l == null) {
            c8925l.f18396l = c12183l;
            c8925l.f18394l = 2;
            List<AppWidgetProviderInfo> installedProviders = this.loadAd.getInstalledProviders();
            ArrayList<AppWidgetProviderInfo> arrayList3 = new ArrayList();
            for (Object obj : installedProviders) {
                if (AbstractC8576l.yandex(((AppWidgetProviderInfo) obj).provider.getPackageName(), this.yandex.getPackageName())) {
                    arrayList3.add(obj);
                }
            }
            ArrayList arrayList4 = new ArrayList();
            for (AppWidgetProviderInfo appWidgetProviderInfo : arrayList3) {
                c3067l.getClass();
                Object objNewInstance = Class.forName(appWidgetProviderInfo.provider.getClassName()).getDeclaredConstructor(null).newInstance(null);
                AbstractC12866l abstractC12866l = objNewInstance instanceof AbstractC12866l ? (AbstractC12866l) objNewInstance : null;
                if (abstractC12866l != null) {
                    arrayList4.add(abstractC12866l);
                }
            }
            objFirebase = ((InterfaceC15829l) c8688l.getValue()).loadAd(new C13624l(arrayList4, interfaceC14029l, 21), c8925l);
            if (objFirebase != enumC9342l) {
                c12183l2 = c12183l;
                c16221l = (C16221l) objFirebase;
                c12183l = c12183l2;
            }
            return enumC9342l;
        }
        packageName = c12183l.yandex.getPackageName();
        set = (Set) c16221l.crashlytics(c16033l);
        if (set == null) {
            C14054l c14054l2 = C14054l.f27396l;
            return new C4808l(c14054l2, c14054l2);
        }
        arrayList = new ArrayList();
        while (r0.hasNext()) {
            componentName = new ComponentName(packageName, str3);
            str2 = (String) c16221l.crashlytics(C3067l.loadAd(c3067l, str3));
            if (str2 == null) {
                c8195l = null;
            } else {
                c8195l = new C8195l(componentName, str2);
            }
            if (c8195l != null) {
                arrayList.add(c8195l);
            }
        }
        Map mapSubscription2 = AbstractC8676l.subscription(arrayList);
        Set<Map.Entry> setEntrySet2 = mapSubscription2.entrySet();
        linkedHashMap = new LinkedHashMap();
        while (r0.hasNext()) {
            str = (String) entry.getValue();
            arrayList2 = linkedHashMap.get(str);
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                linkedHashMap.put(str, arrayList2);
            }
            ((List) arrayList2).add((ComponentName) entry.getKey());
        }
        return new C4808l(mapSubscription2, linkedHashMap);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Serializable loadAd(Class cls, AbstractC0283l abstractC0283l) throws IllegalAccessException, InstantiationException, InvocationTargetException {
        C4493l c4493l;
        if (abstractC0283l instanceof C4493l) {
            c4493l = (C4493l) abstractC0283l;
            int i = c4493l.f9135l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c4493l.f9135l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c4493l = new C4493l(this, abstractC0283l);
            }
        } else {
            c4493l = new C4493l(this, abstractC0283l);
        }
        Object objCrashlytics = c4493l.f9136l;
        int i2 = c4493l.f9135l;
        if (i2 == 0) {
            AbstractC2829l.crashlytics(objCrashlytics);
            c4493l.f9137l = cls;
            c4493l.f9135l = 1;
            objCrashlytics = crashlytics(c4493l);
            EnumC9342l enumC9342l = EnumC9342l.f19165l;
            if (objCrashlytics == enumC9342l) {
                return enumC9342l;
            }
        } else {
            if (i2 != 1) {
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            cls = c4493l.f9137l;
            AbstractC2829l.crashlytics(objCrashlytics);
        }
        C4808l c4808l = (C4808l) objCrashlytics;
        String canonicalName = cls.getCanonicalName();
        if (canonicalName == null) {
            C8339l.metrica("no canonical provider name");
            return null;
        }
        List list = (List) c4808l.loadAd.get(canonicalName);
        if (list == null) {
            return C2580l.f5619l;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            int[] appWidgetIds = this.loadAd.getAppWidgetIds((ComponentName) it.next());
            ArrayList arrayList2 = new ArrayList(appWidgetIds.length);
            for (int i3 : appWidgetIds) {
                arrayList2.add(new C3445l(i3));
            }
            AbstractC3984l.license(arrayList, arrayList2);
        }
        return arrayList;
    }

    public final Object yandex(AbstractC5563l abstractC5563l) {
        String packageName = this.yandex.getPackageName();
        List<AppWidgetProviderInfo> installedProviders = this.loadAd.getInstalledProviders();
        ArrayList arrayList = new ArrayList();
        for (Object obj : installedProviders) {
            if (AbstractC8576l.yandex(((AppWidgetProviderInfo) obj).provider.getPackageName(), packageName)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(AbstractC14055l.billing(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((AppWidgetProviderInfo) it.next()).provider.getClassName());
        }
        Object objLoadAd = ((InterfaceC15829l) this.crashlytics.getValue()).loadAd(new C9211l(AbstractC16901l.m4229l(arrayList2), null, 0), abstractC5563l);
        return objLoadAd == EnumC9342l.f19165l ? objLoadAd : Unit.INSTANCE;
    }
}
