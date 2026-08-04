package defpackage;

import android.util.Log;
import com.google.firebase.components.ComponentRegistrar;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: renamed from: lٍْٞ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C13256l implements InterfaceC15189l {
    public final /* synthetic */ Object loadAd;
    public final /* synthetic */ int yandex;

    public /* synthetic */ C13256l(int i, Object obj) {
        this.yandex = i;
        this.loadAd = obj;
    }

    @Override // defpackage.InterfaceC15189l
    public final Object get() {
        int i = this.yandex;
        Object obj = this.loadAd;
        switch (i) {
            case 0:
                String str = (String) obj;
                try {
                    Class<?> cls = Class.forName(str);
                    if (ComponentRegistrar.class.isAssignableFrom(cls)) {
                        return (ComponentRegistrar) cls.getDeclaredConstructor(null).newInstance(null);
                    }
                    throw new C8090l("Class " + str + " is not an instance of com.google.firebase.components.ComponentRegistrar");
                } catch (ClassNotFoundException unused) {
                    Log.w("ComponentDiscovery", "Class " + str + " is not an found.");
                    return null;
                } catch (IllegalAccessException e) {
                    throw new C8090l(AbstractC15560l.Signature("Could not instantiate ", str, "."), e);
                } catch (InstantiationException e2) {
                    throw new C8090l(AbstractC15560l.Signature("Could not instantiate ", str, "."), e2);
                } catch (NoSuchMethodException e3) {
                    throw new C8090l(AbstractC14814l.startapp("Could not instantiate ", str), e3);
                } catch (InvocationTargetException e4) {
                    throw new C8090l(AbstractC14814l.startapp("Could not instantiate ", str), e4);
                }
            case 1:
                return (ComponentRegistrar) obj;
            default:
                return new C1701l((C14184l) obj);
        }
    }
}
