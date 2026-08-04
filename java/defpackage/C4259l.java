package defpackage;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: lٜؖۡ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C4259l extends AbstractC9453l {
    public static final Parcelable.Creator<C4259l> CREATOR = new C10538l(21);

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final int f8734l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final Uri f8735l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final int f8736l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final int f8737l;

    /* JADX WARN: Illegal instructions before constructor call */
    public C4259l(JSONObject jSONObject) {
        Uri uri = Uri.EMPTY;
        if (jSONObject.has("url")) {
            try {
                uri = Uri.parse(jSONObject.getString("url"));
            } catch (JSONException unused) {
            }
        }
        int iOptInt = jSONObject.optInt("width", 0);
        int iOptInt2 = jSONObject.optInt("height", 0);
        this(1, uri, iOptInt, iOptInt2);
        if (uri == null) {
            C8339l.metrica("url cannot be null");
            throw null;
        }
        if (iOptInt < 0 || iOptInt2 < 0) {
            C8339l.metrica("width and height must not be negative");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof C4259l)) {
            C4259l c4259l = (C4259l) obj;
            if (AbstractC7236l.amazon(this.f8735l, c4259l.f8735l) && this.f8734l == c4259l.f8734l && this.f8737l == c4259l.f8737l) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f8735l, Integer.valueOf(this.f8734l), Integer.valueOf(this.f8737l)});
    }

    public final String toString() {
        Locale locale = Locale.US;
        String string = this.f8735l.toString();
        StringBuilder sbSubscription = AbstractC14814l.subscription(this.f8734l, this.f8737l, "Image ", "x", " ");
        sbSubscription.append(string);
        return sbSubscription.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iTapsense = AbstractC9968l.tapsense(parcel, 20293);
        AbstractC9968l.subscription(parcel, 1, 4);
        parcel.writeInt(this.f8736l);
        AbstractC9968l.remoteconfig(parcel, 2, this.f8735l, i);
        AbstractC9968l.subscription(parcel, 3, 4);
        parcel.writeInt(this.f8734l);
        AbstractC9968l.subscription(parcel, 4, 4);
        parcel.writeInt(this.f8737l);
        AbstractC9968l.Signature(parcel, iTapsense);
    }

    public C4259l(int i, Uri uri, int i2, int i3) {
        this.f8736l = i;
        this.f8735l = uri;
        this.f8734l = i2;
        this.f8737l = i3;
    }
}
