package defpackage;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: lْؓۧ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C1827l extends AbstractC9549l {
    public final /* synthetic */ AccessibleObject admob;
    public final /* synthetic */ int billing = 0;
    public final /* synthetic */ Class mopub;

    public C1827l(Constructor constructor, Class cls) {
        this.admob = constructor;
        this.mopub = cls;
    }

    @Override // defpackage.AbstractC9549l
    public final Object amazon() {
        int i = this.billing;
        AccessibleObject accessibleObject = this.admob;
        switch (i) {
            case 0:
                return ((Constructor) accessibleObject).newInstance(null);
            default:
                return ((Method) accessibleObject).invoke(null, this.mopub, Object.class);
        }
    }

    public final String toString() {
        int i = this.billing;
        Class cls = this.mopub;
        switch (i) {
            case 0:
                break;
        }
        return cls.getName();
    }

    public C1827l(Method method, Class cls) {
        this.admob = method;
        this.mopub = cls;
    }
}
