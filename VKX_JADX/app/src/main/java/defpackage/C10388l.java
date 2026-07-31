package defpackage;

import android.media.Rating;
import android.os.Parcel;
import android.os.Parcelable;
import ealvatag.tag.datatype.DataTypes;

/* JADX INFO: renamed from: lَٚؐ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C10388l implements Parcelable {
    public static final Parcelable.Creator<C10388l> CREATOR = new C10538l(5);

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public Object f21203l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final float f21204l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final int f21205l;

    public C10388l(int i, float f) {
        this.f21205l = i;
        this.f21204l = f;
    }

    public static C10388l billing(int i, float f) {
        float f2;
        if (i == 3) {
            f2 = 3.0f;
        } else if (i == 4) {
            f2 = 4.0f;
        } else {
            if (i != 5) {
                AbstractC6427l.admob(DataTypes.OBJ_RATING, "Invalid rating style (" + i + ") for a star rating");
                return null;
            }
            f2 = 5.0f;
        }
        if (f >= 0.0f && f <= f2) {
            return new C10388l(i, f);
        }
        AbstractC6427l.admob(DataTypes.OBJ_RATING, "Trying to set out of range star-based rating");
        return null;
    }

    public static C10388l purchase(float f) {
        if (f >= 0.0f && f <= 100.0f) {
            return new C10388l(6, f);
        }
        AbstractC6427l.admob(DataTypes.OBJ_RATING, "Invalid percentage-based rating value");
        return null;
    }

    public static C10388l yandex(Parcelable parcelable) {
        C10388l c10388l;
        C10388l c10388l2 = null;
        if (parcelable != null) {
            Rating rating = (Rating) parcelable;
            int ratingStyle = rating.getRatingStyle();
            if (!rating.isRated()) {
                switch (ratingStyle) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        c10388l2 = new C10388l(ratingStyle, -1.0f);
                        break;
                }
            } else {
                switch (ratingStyle) {
                    case 1:
                        c10388l = new C10388l(1, rating.hasHeart() ? 1.0f : 0.0f);
                        break;
                    case 2:
                        c10388l = new C10388l(2, rating.isThumbUp() ? 1.0f : 0.0f);
                        break;
                    case 3:
                    case 4:
                    case 5:
                        c10388l2 = billing(ratingStyle, rating.getStarRating());
                        break;
                    case 6:
                        c10388l2 = purchase(rating.getPercentRating());
                        break;
                }
                c10388l2 = c10388l;
            }
            c10388l2.getClass();
            c10388l2.f21203l = parcelable;
        }
        return c10388l2;
    }

    public final boolean amazon() {
        return this.f21204l >= 0.0f;
    }

    public final float crashlytics() {
        int i = this.f21205l;
        if ((i == 3 || i == 4 || i == 5) && amazon()) {
            return this.f21204l;
        }
        return -1.0f;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return this.f21205l;
    }

    public final Object loadAd() {
        if (this.f21203l == null) {
            boolean zAmazon = amazon();
            int i = this.f21205l;
            if (zAmazon) {
                float f = this.f21204l;
                switch (i) {
                    case 1:
                        this.f21203l = Rating.newHeartRating(i == 1 && f == 1.0f);
                        break;
                    case 2:
                        this.f21203l = Rating.newThumbRating(i == 2 && f == 1.0f);
                        break;
                    case 3:
                    case 4:
                    case 5:
                        this.f21203l = Rating.newStarRating(i, crashlytics());
                        break;
                    case 6:
                        if (i != 6 || !amazon()) {
                            f = -1.0f;
                        }
                        this.f21203l = Rating.newPercentageRating(f);
                        break;
                    default:
                        return null;
                }
            } else {
                this.f21203l = Rating.newUnratedRating(i);
            }
        }
        return this.f21203l;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Rating:style=");
        sb.append(this.f21205l);
        sb.append(" rating=");
        float f = this.f21204l;
        sb.append(f < 0.0f ? "unrated" : String.valueOf(f));
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f21205l);
        parcel.writeFloat(this.f21204l);
    }
}
