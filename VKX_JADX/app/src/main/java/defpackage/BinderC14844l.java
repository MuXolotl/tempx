package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import java.lang.reflect.Field;

/* JADX INFO: renamed from: lّٔؑ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class BinderC14844l extends AbstractBinderC5395l implements InterfaceC3396l {
    public final Object billing;

    public BinderC14844l(Object obj) {
        super("com.google.android.gms.dynamic.IObjectWrapper", 3);
        this.billing = obj;
    }

    /* JADX INFO: renamed from: lؑؓۙ, reason: contains not printable characters */
    public static InterfaceC3396l m3896l(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
        return iInterfaceQueryLocalInterface instanceof InterfaceC3396l ? (InterfaceC3396l) iInterfaceQueryLocalInterface : new C6169l(iBinder, "com.google.android.gms.dynamic.IObjectWrapper", 2);
    }

    /* JADX INFO: renamed from: lِۙٞ, reason: contains not printable characters */
    public static Object m3897l(InterfaceC3396l interfaceC3396l) {
        if (interfaceC3396l instanceof BinderC14844l) {
            return ((BinderC14844l) interfaceC3396l).billing;
        }
        IBinder iBinderAsBinder = interfaceC3396l.asBinder();
        Field[] declaredFields = iBinderAsBinder.getClass().getDeclaredFields();
        Field field = null;
        int i = 0;
        for (Field field2 : declaredFields) {
            if (!field2.isSynthetic()) {
                i++;
                field = field2;
            }
        }
        if (i != 1) {
            int length = declaredFields.length;
            C8339l.metrica(AbstractC9361l.Signature(length, "Unexpected number of IObjectWrapper declared fields: ", new StringBuilder(String.valueOf(length).length() + 53)));
            return null;
        }
        AbstractC1051l.subs(field);
        if (field.isAccessible()) {
            C8339l.metrica("IObjectWrapper declared field not private!");
            return null;
        }
        field.setAccessible(true);
        try {
            return field.get(iBinderAsBinder);
        } catch (IllegalAccessException e) {
            throw new IllegalArgumentException("Could not access the field in remoteBinder.", e);
        } catch (NullPointerException e2) {
            throw new IllegalArgumentException("Binder object is null.", e2);
        }
    }
}
