package defpackage;

import android.os.Bundle;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: lَّٜ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C12517l implements InterfaceC13342l {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final Object f24660l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f24661l;

    public /* synthetic */ C12517l(int i, Object obj) {
        this.f24661l = i;
        this.f24660l = obj;
    }

    @Override // defpackage.InterfaceC13342l
    public final void ads(InterfaceC3177l interfaceC3177l, EnumC14812l enumC14812l) {
        int i = this.f24661l;
        Object obj = this.f24660l;
        switch (i) {
            case 0:
                InterfaceC3187l interfaceC3187l = (InterfaceC3187l) obj;
                if (enumC14812l != EnumC14812l.ON_CREATE) {
                    C8339l.subs("Next event must be ON_CREATE");
                    return;
                }
                interfaceC3177l.loadAd().loadAd(this);
                Bundle bundleTapsense = interfaceC3187l.metrica().tapsense("androidx.savedstate.Restarter");
                if (bundleTapsense == null) {
                    return;
                }
                ArrayList<String> stringArrayList = bundleTapsense.getStringArrayList("classes_to_restore");
                if (stringArrayList == null) {
                    C8339l.smaato("SavedState with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
                    return;
                }
                for (String str : stringArrayList) {
                    try {
                        Class<? extends U> clsAsSubclass = Class.forName(str, false, C12517l.class.getClassLoader()).asSubclass(InterfaceC9032l.class);
                        try {
                            Constructor declaredConstructor = clsAsSubclass.getDeclaredConstructor(null);
                            declaredConstructor.setAccessible(true);
                            try {
                                ((C5316l) ((InterfaceC9032l) declaredConstructor.newInstance(null))).getClass();
                                if (!(interfaceC3187l instanceof InterfaceC0798l)) {
                                    C18073l.firebase(interfaceC3187l, "Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner. Received owner: ");
                                    return;
                                }
                                C15018l c15018lFirebase = ((InterfaceC0798l) interfaceC3187l).firebase();
                                C18396l c18396lMetrica = interfaceC3187l.metrica();
                                LinkedHashMap linkedHashMap = c15018lFirebase.yandex;
                                LinkedHashMap linkedHashMap2 = c15018lFirebase.yandex;
                                Iterator it = AbstractC16901l.m4229l(linkedHashMap.keySet()).iterator();
                                while (it.hasNext()) {
                                    AbstractC4350l abstractC4350l = (AbstractC4350l) linkedHashMap2.get(it.next());
                                    if (abstractC4350l != null) {
                                        AbstractC2387l.amazon(abstractC4350l, c18396lMetrica, interfaceC3187l.loadAd());
                                    }
                                }
                                if (!AbstractC16901l.m4229l(linkedHashMap2.keySet()).isEmpty()) {
                                    c18396lMetrica.m4524native();
                                }
                            } catch (Exception e) {
                                C18073l.Signature(AbstractC14814l.startapp("Failed to instantiate ", str), e);
                                return;
                            }
                        } catch (NoSuchMethodException e2) {
                            throw new IllegalStateException("Class " + clsAsSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e2);
                        }
                    } catch (ClassNotFoundException e3) {
                        C18073l.Signature(AbstractC15560l.Signature("Class ", str, " wasn't found"), e3);
                        return;
                    }
                }
                return;
            case 1:
                AbstractActivityC14666l abstractActivityC14666l = (AbstractActivityC14666l) obj;
                if (abstractActivityC14666l.f28687l == null) {
                    C4160l c4160l = (C4160l) abstractActivityC14666l.getLastNonConfigurationInstance();
                    if (c4160l != null) {
                        abstractActivityC14666l.f28687l = c4160l.yandex;
                    }
                    if (abstractActivityC14666l.f28687l == null) {
                        abstractActivityC14666l.f28687l = new C15018l();
                    }
                }
                abstractActivityC14666l.f23523l.loadAd(this);
                return;
            case 2:
                new HashMap();
                InterfaceC2685l[] interfaceC2685lArr = (InterfaceC2685l[]) obj;
                if (interfaceC2685lArr.length > 0) {
                    InterfaceC2685l interfaceC2685l = interfaceC2685lArr[0];
                    throw null;
                }
                if (interfaceC2685lArr.length <= 0) {
                    return;
                }
                InterfaceC2685l interfaceC2685l2 = interfaceC2685lArr[0];
                throw null;
            case 3:
                if (enumC14812l == EnumC14812l.ON_STOP) {
                    ((AbstractComponentCallbacksC4411l) obj).getClass();
                    return;
                }
                return;
            default:
                if (enumC14812l != EnumC14812l.ON_CREATE) {
                    C18073l.firebase(enumC14812l, "Next event must be ON_CREATE, it was ");
                    return;
                } else {
                    interfaceC3177l.loadAd().loadAd(this);
                    ((C2705l) obj).loadAd();
                    return;
                }
        }
    }
}
