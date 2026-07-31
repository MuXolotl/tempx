package defpackage;

import io.realm.kotlin.internal.interop.LongPointerWrapper;
import io.realm.kotlin.internal.interop.NativePointer;
import io.realm.kotlin.internal.interop.realm_value_t;
import io.realm.kotlin.internal.interop.realmcJNI;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: lؘْۥ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC5661l {
    public static final /* synthetic */ int yandex = 0;

    static {
        new IllegalStateException("This class has not been modified by the Realm Compiler Plugin. Has the Realm Gradle Plugin been applied to the project with this model class?");
    }

    public static final InterfaceC2851l loadAd(C5501l c5501l, C6067l c6067l, InterfaceC1388l interfaceC1388l, String str, realm_value_t realm_value_tVar, int i) {
        LongPointerWrapper longPointerWrapper;
        NativePointer nativePointer = c6067l.f12835l;
        long j = c6067l.mo1847l().crashlytics(str).loadAd;
        int iInmobi = AbstractC5020l.inmobi(i);
        if (iInmobi == 0) {
            long ptr$cinterop_release = ((LongPointerWrapper) nativePointer).getPtr$cinterop_release();
            int i2 = AbstractC9795l.yandex;
            longPointerWrapper = new LongPointerWrapper(realmcJNI.realm_object_create_with_primary_key(ptr$cinterop_release, j, realm_value_tVar.yandex, realm_value_tVar), false, 2, null);
        } else {
            if (iInmobi != 1) {
                C18725l.billing();
                return null;
            }
            long ptr$cinterop_release2 = ((LongPointerWrapper) nativePointer).getPtr$cinterop_release();
            int i3 = AbstractC9795l.yandex;
            longPointerWrapper = new LongPointerWrapper(realmcJNI.realm_object_get_or_create_with_primary_key(ptr$cinterop_release2, j, realm_value_tVar.yandex, realm_value_tVar, new boolean[]{false}), false, 2, null);
        }
        return AbstractC6710l.smaato(longPointerWrapper, interfaceC1388l, c5501l, c6067l);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x005d  */
    public static final InterfaceC9671l yandex(C5501l c5501l, C6067l c6067l, InterfaceC9671l interfaceC9671l, int i, Map map) {
        String strYandex;
        InterfaceC2851l interfaceC2851lSmaato;
        String str;
        C0717l c0717lYandex;
        Object obj = null;
        if (!AbstractC15011l.isPro(interfaceC9671l)) {
            C8339l.metrica("Cannot copy an invalid managed object to Realm.");
            return null;
        }
        InterfaceC9671l interfaceC9671l2 = (InterfaceC9671l) map.get(interfaceC9671l);
        if (interfaceC9671l2 == null) {
            C1332l f36736l = ((InterfaceC2851l) interfaceC9671l).getF36705l();
            if (f36736l == null) {
                interfaceC9671l2 = null;
            } else {
                if (!AbstractC8576l.yandex(f36736l.f3419l, c6067l)) {
                    C8339l.metrica("Cannot set/copyToRealm an outdated object. Use findLatest(object) to find the version of the object required in the given context.");
                    return null;
                }
                interfaceC9671l2 = interfaceC9671l;
            }
            if (interfaceC9671l2 == null) {
                boolean z = true;
                if (interfaceC9671l instanceof C12555l) {
                    C12555l c12555l = (C12555l) interfaceC9671l;
                    strYandex = c12555l.f24740l;
                    C2330l c2330lYandex = c6067l.mo1847l().yandex(strYandex);
                    if (c2330lYandex == null) {
                        str = null;
                    } else {
                        if (c2330lYandex.admob) {
                            C8339l.metrica("Cannot create embedded object without a parent");
                            return null;
                        }
                        C0717l c0717l = c2330lYandex.mopub;
                        if (c0717l == null || (c0717lYandex = c2330lYandex.yandex(c0717l.amazon)) == null) {
                            str = null;
                        } else {
                            str = c0717lYandex.loadAd;
                        }
                    }
                    z = str != null;
                    if (str != null) {
                        LinkedHashMap linkedHashMap = c12555l.f24739l;
                        if (!linkedHashMap.containsKey(str)) {
                            C8339l.metrica(AbstractC14814l.ads("Cannot create object of type '", strYandex, "' without primary key property '", str, "'"));
                            return null;
                        }
                        obj = linkedHashMap.get(str);
                    }
                } else {
                    InterfaceC13226l interfaceC13226lLoadAd = AbstractC5293l.loadAd(AbstractC18202l.yandex.loadAd(interfaceC9671l.getClass()));
                    strYandex = interfaceC13226lLoadAd.yandex();
                    if (interfaceC13226lLoadAd.amazon() == 2) {
                        C8339l.metrica("Cannot create embedded object without a parent");
                        return null;
                    }
                    InterfaceC2463l interfaceC2463lMopub = interfaceC13226lLoadAd.mopub();
                    if (interfaceC2463lMopub != null) {
                        obj = interfaceC2463lMopub.get(interfaceC9671l);
                    } else {
                        z = false;
                    }
                }
                String str2 = strYandex;
                if (z) {
                    C3585l c3585l = new C3585l(16);
                    try {
                        interfaceC2851lSmaato = loadAd(c5501l, c6067l, AbstractC18202l.yandex.loadAd(interfaceC9671l.getClass()), str2, AbstractC17344l.amazon(c3585l, obj), i);
                        c3585l.tapsense();
                    } catch (IllegalStateException e) {
                        throw new IllegalArgumentException(e.getMessage(), e.getCause());
                    }
                } else {
                    InterfaceC1388l interfaceC1388lLoadAd = AbstractC18202l.yandex.loadAd(interfaceC9671l.getClass());
                    long j = c6067l.mo1847l().crashlytics(str2).loadAd;
                    long ptr$cinterop_release = ((LongPointerWrapper) c6067l.f12835l).getPtr$cinterop_release();
                    int i2 = AbstractC9795l.yandex;
                    interfaceC2851lSmaato = AbstractC6710l.smaato(new LongPointerWrapper(realmcJNI.realm_object_create(ptr$cinterop_release, j), false, 2, null), interfaceC1388lLoadAd, c5501l, c6067l);
                }
                map.put(interfaceC9671l, interfaceC2851lSmaato);
                C2782l.isPro(interfaceC2851lSmaato, interfaceC9671l, i, map);
                return interfaceC2851lSmaato;
            }
        }
        return interfaceC9671l2;
    }
}
