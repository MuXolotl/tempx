package androidx.core.app;

import android.app.PendingIntent;
import android.os.Parcel;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import defpackage.AbstractC5223l;
import defpackage.C9890l;
import defpackage.InterfaceC12713l;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(AbstractC5223l abstractC5223l) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        InterfaceC12713l interfaceC12713lAdmob = remoteActionCompat.yandex;
        boolean z = true;
        if (abstractC5223l.purchase(1)) {
            interfaceC12713lAdmob = abstractC5223l.admob();
        }
        remoteActionCompat.yandex = (IconCompat) interfaceC12713lAdmob;
        CharSequence charSequence = remoteActionCompat.loadAd;
        if (abstractC5223l.purchase(2)) {
            charSequence = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((C9890l) abstractC5223l).purchase);
        }
        remoteActionCompat.loadAd = charSequence;
        CharSequence charSequence2 = remoteActionCompat.crashlytics;
        if (abstractC5223l.purchase(3)) {
            charSequence2 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((C9890l) abstractC5223l).purchase);
        }
        remoteActionCompat.crashlytics = charSequence2;
        remoteActionCompat.amazon = (PendingIntent) abstractC5223l.mopub(remoteActionCompat.amazon, 4);
        boolean z2 = remoteActionCompat.purchase;
        if (abstractC5223l.purchase(5)) {
            z2 = ((C9890l) abstractC5223l).purchase.readInt() != 0;
        }
        remoteActionCompat.purchase = z2;
        boolean z3 = remoteActionCompat.billing;
        if (!abstractC5223l.purchase(6)) {
            z = z3;
        } else if (((C9890l) abstractC5223l).purchase.readInt() == 0) {
            z = false;
        }
        remoteActionCompat.billing = z;
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, AbstractC5223l abstractC5223l) {
        abstractC5223l.getClass();
        IconCompat iconCompat = remoteActionCompat.yandex;
        abstractC5223l.subs(1);
        abstractC5223l.smaato(iconCompat);
        CharSequence charSequence = remoteActionCompat.loadAd;
        abstractC5223l.subs(2);
        Parcel parcel = ((C9890l) abstractC5223l).purchase;
        TextUtils.writeToParcel(charSequence, parcel, 0);
        CharSequence charSequence2 = remoteActionCompat.crashlytics;
        abstractC5223l.subs(3);
        TextUtils.writeToParcel(charSequence2, parcel, 0);
        abstractC5223l.firebase(remoteActionCompat.amazon, 4);
        boolean z = remoteActionCompat.purchase;
        abstractC5223l.subs(5);
        parcel.writeInt(z ? 1 : 0);
        boolean z2 = remoteActionCompat.billing;
        abstractC5223l.subs(6);
        parcel.writeInt(z2 ? 1 : 0);
    }
}
