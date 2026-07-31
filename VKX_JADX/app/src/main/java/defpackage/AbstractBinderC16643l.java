package defpackage;

import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import java.util.Arrays;

/* JADX INFO: renamed from: lٖۜؖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractBinderC16643l extends AbstractBinderC5395l implements IInterface {
    public final int billing;

    public AbstractBinderC16643l(byte[] bArr) {
        super("com.google.android.gms.common.internal.ICertData", 3);
        AbstractC1051l.loadAd(bArr.length == 25);
        this.billing = Arrays.hashCode(bArr);
    }

    public final boolean equals(Object obj) {
        InterfaceC3396l interfaceC3396lM4190l;
        if (obj instanceof AbstractBinderC16643l) {
            try {
                AbstractBinderC16643l abstractBinderC16643l = (AbstractBinderC16643l) obj;
                if (abstractBinderC16643l.billing == this.billing && (interfaceC3396lM4190l = abstractBinderC16643l.m4190l()) != null) {
                    return Arrays.equals(mo2702l(), (byte[]) BinderC14844l.m3897l(interfaceC3396lM4190l));
                }
            } catch (RemoteException e) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e);
                return false;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.billing;
    }

    /* JADX INFO: renamed from: lؑؓۙ */
    public abstract byte[] mo2702l();

    @Override // defpackage.AbstractBinderC5395l
    /* JADX INFO: renamed from: lٕؓۡ */
    public final boolean mo1129l(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            InterfaceC3396l interfaceC3396lM4190l = m4190l();
            parcel2.writeNoException();
            AbstractC2020l.loadAd(parcel2, interfaceC3396lM4190l);
            return true;
        }
        if (i != 2) {
            return false;
        }
        parcel2.writeNoException();
        parcel2.writeInt(this.billing);
        return true;
    }

    /* JADX INFO: renamed from: lِۙٞ, reason: contains not printable characters */
    public final InterfaceC3396l m4190l() {
        return new BinderC14844l(mo2702l());
    }
}
