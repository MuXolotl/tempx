package defpackage;

import android.os.Parcel;

/* JADX INFO: renamed from: lًؔؕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class BinderC2379l extends AbstractBinderC5395l {
    public final InterfaceC14623l billing;
    public final Class mopub;

    public BinderC2379l(InterfaceC14623l interfaceC14623l) {
        super("com.google.android.gms.cast.framework.ISessionManagerListener", 2);
        this.billing = interfaceC14623l;
        this.mopub = C0189l.class;
    }

    @Override // defpackage.AbstractBinderC5395l
    /* JADX INFO: renamed from: lٕؓۡ, reason: contains not printable characters */
    public final boolean mo1129l(int i, Parcel parcel, Parcel parcel2) {
        Class cls = this.mopub;
        InterfaceC14623l interfaceC14623l = this.billing;
        switch (i) {
            case 1:
                BinderC14844l binderC14844l = new BinderC14844l(interfaceC14623l);
                parcel2.writeNoException();
                AbstractC14627l.crashlytics(parcel2, binderC14844l);
                return true;
            case 2:
                InterfaceC3396l interfaceC3396lM3896l = BinderC14844l.m3896l(parcel.readStrongBinder());
                AbstractC14627l.amazon(parcel);
                AbstractC11229l abstractC11229l = (AbstractC11229l) BinderC14844l.m3897l(interfaceC3396lM3896l);
                if (cls.isInstance(abstractC11229l) && interfaceC14623l != null) {
                    interfaceC14623l.admob((AbstractC11229l) cls.cast(abstractC11229l));
                }
                parcel2.writeNoException();
                return true;
            case 3:
                InterfaceC3396l interfaceC3396lM3896l2 = BinderC14844l.m3896l(parcel.readStrongBinder());
                String string = parcel.readString();
                AbstractC14627l.amazon(parcel);
                AbstractC11229l abstractC11229l2 = (AbstractC11229l) BinderC14844l.m3897l(interfaceC3396lM3896l2);
                if (cls.isInstance(abstractC11229l2) && interfaceC14623l != null) {
                    interfaceC14623l.firebase((AbstractC11229l) cls.cast(abstractC11229l2), string);
                }
                parcel2.writeNoException();
                return true;
            case 4:
                InterfaceC3396l interfaceC3396lM3896l3 = BinderC14844l.m3896l(parcel.readStrongBinder());
                int i2 = parcel.readInt();
                AbstractC14627l.amazon(parcel);
                AbstractC11229l abstractC11229l3 = (AbstractC11229l) BinderC14844l.m3897l(interfaceC3396lM3896l3);
                if (cls.isInstance(abstractC11229l3) && interfaceC14623l != null) {
                    interfaceC14623l.billing((AbstractC11229l) cls.cast(abstractC11229l3), i2);
                }
                parcel2.writeNoException();
                return true;
            case 5:
                InterfaceC3396l interfaceC3396lM3896l4 = BinderC14844l.m3896l(parcel.readStrongBinder());
                AbstractC14627l.amazon(parcel);
                AbstractC11229l abstractC11229l4 = (AbstractC11229l) BinderC14844l.m3897l(interfaceC3396lM3896l4);
                if (cls.isInstance(abstractC11229l4) && interfaceC14623l != null) {
                    interfaceC14623l.remoteconfig((AbstractC11229l) cls.cast(abstractC11229l4));
                }
                parcel2.writeNoException();
                return true;
            case 6:
                InterfaceC3396l interfaceC3396lM3896l5 = BinderC14844l.m3896l(parcel.readStrongBinder());
                int i3 = parcel.readInt();
                AbstractC14627l.amazon(parcel);
                AbstractC11229l abstractC11229l5 = (AbstractC11229l) BinderC14844l.m3897l(interfaceC3396lM3896l5);
                if (cls.isInstance(abstractC11229l5) && interfaceC14623l != null) {
                    interfaceC14623l.vip((AbstractC11229l) cls.cast(abstractC11229l5), i3);
                }
                parcel2.writeNoException();
                return true;
            case 7:
                InterfaceC3396l interfaceC3396lM3896l6 = BinderC14844l.m3896l(parcel.readStrongBinder());
                String string2 = parcel.readString();
                AbstractC14627l.amazon(parcel);
                AbstractC11229l abstractC11229l6 = (AbstractC11229l) BinderC14844l.m3897l(interfaceC3396lM3896l6);
                if (cls.isInstance(abstractC11229l6) && interfaceC14623l != null) {
                    interfaceC14623l.yandex((AbstractC11229l) cls.cast(abstractC11229l6), string2);
                }
                parcel2.writeNoException();
                return true;
            case 8:
                InterfaceC3396l interfaceC3396lM3896l7 = BinderC14844l.m3896l(parcel.readStrongBinder());
                int i4 = AbstractC14627l.yandex;
                boolean z = parcel.readInt() != 0;
                AbstractC14627l.amazon(parcel);
                AbstractC11229l abstractC11229l7 = (AbstractC11229l) BinderC14844l.m3897l(interfaceC3396lM3896l7);
                if (cls.isInstance(abstractC11229l7) && interfaceC14623l != null) {
                    interfaceC14623l.startapp((AbstractC11229l) cls.cast(abstractC11229l7), z);
                }
                parcel2.writeNoException();
                return true;
            case 9:
                InterfaceC3396l interfaceC3396lM3896l8 = BinderC14844l.m3896l(parcel.readStrongBinder());
                int i5 = parcel.readInt();
                AbstractC14627l.amazon(parcel);
                AbstractC11229l abstractC11229l8 = (AbstractC11229l) BinderC14844l.m3897l(interfaceC3396lM3896l8);
                if (cls.isInstance(abstractC11229l8) && interfaceC14623l != null) {
                    interfaceC14623l.smaato((AbstractC11229l) cls.cast(abstractC11229l8), i5);
                }
                parcel2.writeNoException();
                return true;
            case 10:
                InterfaceC3396l interfaceC3396lM3896l9 = BinderC14844l.m3896l(parcel.readStrongBinder());
                int i6 = parcel.readInt();
                AbstractC14627l.amazon(parcel);
                AbstractC11229l abstractC11229l9 = (AbstractC11229l) BinderC14844l.m3897l(interfaceC3396lM3896l9);
                if (cls.isInstance(abstractC11229l9) && interfaceC14623l != null) {
                    interfaceC14623l.isPro((AbstractC11229l) cls.cast(abstractC11229l9), i6);
                }
                parcel2.writeNoException();
                return true;
            case 11:
                parcel2.writeNoException();
                parcel2.writeInt(12451000);
                return true;
            default:
                return false;
        }
    }
}
