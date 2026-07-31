package defpackage;

import android.os.Bundle;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: renamed from: lٔۢۛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractBinderC15260l extends AbstractBinderC5395l implements IInterface {
    public final /* synthetic */ int billing;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractBinderC15260l(int i) {
        super("com.google.android.gms.cast.internal.IBundleCallback", 2);
        this.billing = i;
        switch (i) {
            case 1:
                super("com.google.android.gms.cast.internal.ICastDeviceControllerListener", 2);
                break;
            default:
                break;
        }
    }

    /* JADX INFO: renamed from: lؑؓۙ */
    public abstract void mo1248l(int i);

    /* JADX INFO: renamed from: lؑٞۘ */
    public abstract void mo1249l(int i);

    /* JADX INFO: renamed from: lؒۜۡ */
    public abstract void mo1250l(C5040l c5040l, String str, String str2, boolean z);

    @Override // defpackage.AbstractBinderC5395l
    /* JADX INFO: renamed from: lٕؓۡ */
    public final boolean mo1129l(int i, Parcel parcel, Parcel parcel2) {
        switch (this.billing) {
            case 0:
                if (i != 1) {
                    return false;
                }
                Bundle bundle = (Bundle) AbstractC14627l.yandex(parcel, Bundle.CREATOR);
                AbstractC14627l.amazon(parcel);
                mo3949return(bundle);
                return true;
            default:
                switch (i) {
                    case 1:
                        int i2 = parcel.readInt();
                        AbstractC14627l.amazon(parcel);
                        mo1248l(i2);
                        break;
                    case 2:
                        C5040l c5040l = (C5040l) AbstractC14627l.yandex(parcel, C5040l.CREATOR);
                        String string = parcel.readString();
                        String string2 = parcel.readString();
                        boolean z = parcel.readInt() != 0;
                        AbstractC14627l.amazon(parcel);
                        mo1250l(c5040l, string, string2, z);
                        break;
                    case 3:
                        int i3 = parcel.readInt();
                        AbstractC14627l.amazon(parcel);
                        mo1259l(i3);
                        break;
                    case 4:
                        parcel.readString();
                        parcel.readDouble();
                        int i4 = AbstractC14627l.yandex;
                        parcel.readInt();
                        AbstractC14627l.amazon(parcel);
                        mo1256l();
                        break;
                    case 5:
                        String string3 = parcel.readString();
                        String string4 = parcel.readString();
                        AbstractC14627l.amazon(parcel);
                        mo1262l(string3, string4);
                        break;
                    case 6:
                        String string5 = parcel.readString();
                        byte[] bArrCreateByteArray = parcel.createByteArray();
                        AbstractC14627l.amazon(parcel);
                        mo1261l(string5, bArrCreateByteArray);
                        break;
                    case 7:
                        int i5 = parcel.readInt();
                        AbstractC14627l.amazon(parcel);
                        mo1251l(i5);
                        break;
                    case 8:
                        int i6 = parcel.readInt();
                        AbstractC14627l.amazon(parcel);
                        mo1249l(i6);
                        break;
                    case 9:
                        int i7 = parcel.readInt();
                        AbstractC14627l.amazon(parcel);
                        mo1253l(i7);
                        break;
                    case 10:
                        parcel.readString();
                        long j = parcel.readLong();
                        int i8 = parcel.readInt();
                        AbstractC14627l.amazon(parcel);
                        mo1257l(i8, j);
                        break;
                    case 11:
                        parcel.readString();
                        long j2 = parcel.readLong();
                        AbstractC14627l.amazon(parcel);
                        mo1252l(j2);
                        break;
                    case 12:
                        C13853l c13853l = (C13853l) AbstractC14627l.yandex(parcel, C13853l.CREATOR);
                        AbstractC14627l.amazon(parcel);
                        mo1254l(c13853l);
                        break;
                    case 13:
                        C3882l c3882l = (C3882l) AbstractC14627l.yandex(parcel, C3882l.CREATOR);
                        AbstractC14627l.amazon(parcel);
                        mo1255l(c3882l);
                        break;
                    case 14:
                        int i9 = parcel.readInt();
                        AbstractC14627l.amazon(parcel);
                        mo1258l(i9);
                        break;
                    case 15:
                        int i10 = parcel.readInt();
                        AbstractC14627l.amazon(parcel);
                        mo1260l(i10);
                        break;
                    default:
                        return false;
                }
                return true;
        }
    }

    /* JADX INFO: renamed from: lؔۥ٘ */
    public abstract void mo1251l(int i);

    /* JADX INFO: renamed from: lؖٙؖ */
    public abstract void mo1252l(long j);

    /* JADX INFO: renamed from: lؘٞۨ */
    public abstract void mo1253l(int i);

    /* JADX INFO: renamed from: lؙؕؕ */
    public abstract void mo1254l(C13853l c13853l);

    /* JADX INFO: renamed from: lٍ۟ۨ */
    public abstract void mo1255l(C3882l c3882l);

    /* JADX INFO: renamed from: lَٜؑ */
    public abstract void mo1256l();

    /* JADX INFO: renamed from: lَؙ۠ */
    public abstract void mo1257l(int i, long j);

    /* JADX INFO: renamed from: lِۙٞ */
    public abstract void mo1258l(int i);

    /* JADX INFO: renamed from: lْۣٔ */
    public abstract void mo1259l(int i);

    /* JADX INFO: renamed from: lٔ٘۠ */
    public abstract void mo1260l(int i);

    /* JADX INFO: renamed from: lًٔۘ */
    public abstract void mo1261l(String str, byte[] bArr);

    /* JADX INFO: renamed from: lٕؖؔ */
    public abstract void mo1262l(String str, String str2);

    /* JADX INFO: renamed from: return, reason: not valid java name */
    public abstract void mo3949return(Bundle bundle);
}
