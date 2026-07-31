package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: lؒٔۡ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C1056l extends AbstractC9453l {

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public static final C5991l f2920l;

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public int f2922l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final Bundle f2923l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final List f2924l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public static final String[] f2921l = {"none", "String", "int", "double", "ISO-8601 date String", "Time in milliseconds as long"};
    public static final Parcelable.Creator<C1056l> CREATOR = new C13546l(17);

    static {
        C5991l c5991l = new C5991l((byte) 0, 16);
        c5991l.premium("com.google.android.gms.cast.metadata.CREATION_DATE", 4, "creationDateTime");
        c5991l.premium("com.google.android.gms.cast.metadata.RELEASE_DATE", 4, "releaseDate");
        c5991l.premium("com.google.android.gms.cast.metadata.BROADCAST_DATE", 4, "originalAirdate");
        c5991l.premium("com.google.android.gms.cast.metadata.TITLE", 1, "title");
        c5991l.premium("com.google.android.gms.cast.metadata.SUBTITLE", 1, "subtitle");
        c5991l.premium("com.google.android.gms.cast.metadata.ARTIST", 1, "artist");
        c5991l.premium("com.google.android.gms.cast.metadata.ALBUM_ARTIST", 1, "albumArtist");
        c5991l.premium("com.google.android.gms.cast.metadata.ALBUM_TITLE", 1, "albumName");
        c5991l.premium("com.google.android.gms.cast.metadata.COMPOSER", 1, "composer");
        c5991l.premium("com.google.android.gms.cast.metadata.DISC_NUMBER", 2, "discNumber");
        c5991l.premium("com.google.android.gms.cast.metadata.TRACK_NUMBER", 2, "trackNumber");
        c5991l.premium("com.google.android.gms.cast.metadata.SEASON_NUMBER", 2, "season");
        c5991l.premium("com.google.android.gms.cast.metadata.EPISODE_NUMBER", 2, "episode");
        c5991l.premium("com.google.android.gms.cast.metadata.SERIES_TITLE", 1, "seriesTitle");
        c5991l.premium("com.google.android.gms.cast.metadata.STUDIO", 1, "studio");
        c5991l.premium("com.google.android.gms.cast.metadata.WIDTH", 2, "width");
        c5991l.premium("com.google.android.gms.cast.metadata.HEIGHT", 2, "height");
        c5991l.premium("com.google.android.gms.cast.metadata.LOCATION_NAME", 1, "location");
        c5991l.premium("com.google.android.gms.cast.metadata.LOCATION_LATITUDE", 3, "latitude");
        c5991l.premium("com.google.android.gms.cast.metadata.LOCATION_LONGITUDE", 3, "longitude");
        c5991l.premium("com.google.android.gms.cast.metadata.SECTION_DURATION", 5, "sectionDuration");
        c5991l.premium("com.google.android.gms.cast.metadata.SECTION_START_TIME_IN_MEDIA", 5, "sectionStartTimeInMedia");
        c5991l.premium("com.google.android.gms.cast.metadata.SECTION_START_ABSOLUTE_TIME", 5, "sectionStartAbsoluteTime");
        c5991l.premium("com.google.android.gms.cast.metadata.SECTION_START_TIME_IN_CONTAINER", 5, "sectionStartTimeInContainer");
        c5991l.premium("com.google.android.gms.cast.metadata.QUEUE_ITEM_ID", 2, "queueItemId");
        c5991l.premium("com.google.android.gms.cast.metadata.BOOK_TITLE", 1, "bookTitle");
        c5991l.premium("com.google.android.gms.cast.metadata.CHAPTER_NUMBER", 2, "chapterNumber");
        c5991l.premium("com.google.android.gms.cast.metadata.CHAPTER_TITLE", 1, "chapterTitle");
        f2920l = c5991l;
    }

    public C1056l(int i) {
        this(new ArrayList(), new Bundle(), i);
    }

    public static boolean admob(Bundle bundle, Bundle bundle2) {
        if (bundle.size() != bundle2.size()) {
            return false;
        }
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            Object obj2 = bundle2.get(str);
            if ((obj instanceof Bundle) && (obj2 instanceof Bundle) && !admob((Bundle) obj, (Bundle) obj2)) {
                return false;
            }
            if (obj == null) {
                if (obj2 != null || !bundle2.containsKey(str)) {
                    return false;
                }
            } else if (!obj.equals(obj2)) {
                return false;
            }
        }
        return true;
    }

    public final String billing(String str) {
        if (TextUtils.isEmpty(str)) {
            C8339l.metrica("null and empty keys are not allowed");
            return null;
        }
        Integer num = (Integer) ((HashMap) f2920l.f12718l).get(str);
        int iIntValue = num != null ? num.intValue() : 0;
        if (iIntValue == 1 || iIntValue == 0) {
            return this.f2923l.getString(str);
        }
        String str2 = f2921l[1];
        C8339l.metrica(AbstractC9361l.advert(new StringBuilder(str.length() + 21 + String.valueOf(str2).length()), "Value for ", str, " must be a ", str2));
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1056l)) {
            return false;
        }
        C1056l c1056l = (C1056l) obj;
        return admob(this.f2923l, c1056l.f2923l) && this.f2924l.equals(c1056l.f2924l);
    }

    public final int hashCode() {
        int iHashCode = 17;
        Bundle bundle = this.f2923l;
        if (bundle != null) {
            Iterator<String> it = bundle.keySet().iterator();
            while (it.hasNext()) {
                Object obj = bundle.get(it.next());
                iHashCode = (iHashCode * 31) + (obj != null ? obj.hashCode() : 0);
            }
        }
        return this.f2924l.hashCode() + (iHashCode * 31);
    }

    public final void mopub(JSONObject jSONObject) {
        Bundle bundle = this.f2923l;
        bundle.clear();
        List list = this.f2924l;
        list.clear();
        this.f2922l = 0;
        try {
            this.f2922l = jSONObject.getInt("metadataType");
        } catch (JSONException unused) {
        }
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("images");
        if (jSONArrayOptJSONArray != null) {
            AbstractC18344l.yandex(list, jSONArrayOptJSONArray);
        }
        ArrayList arrayList = new ArrayList();
        int i = this.f2922l;
        if (i == 0) {
            Collections.addAll(arrayList, "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.ARTIST", "com.google.android.gms.cast.metadata.SUBTITLE", "com.google.android.gms.cast.metadata.RELEASE_DATE");
        } else if (i == 1) {
            Collections.addAll(arrayList, "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.STUDIO", "com.google.android.gms.cast.metadata.SUBTITLE", "com.google.android.gms.cast.metadata.RELEASE_DATE");
        } else if (i == 2) {
            Collections.addAll(arrayList, "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.SERIES_TITLE", "com.google.android.gms.cast.metadata.SEASON_NUMBER", "com.google.android.gms.cast.metadata.EPISODE_NUMBER", "com.google.android.gms.cast.metadata.BROADCAST_DATE");
        } else if (i == 3) {
            Collections.addAll(arrayList, "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.ALBUM_TITLE", "com.google.android.gms.cast.metadata.ARTIST", "com.google.android.gms.cast.metadata.ALBUM_ARTIST", "com.google.android.gms.cast.metadata.COMPOSER", "com.google.android.gms.cast.metadata.TRACK_NUMBER", "com.google.android.gms.cast.metadata.DISC_NUMBER", "com.google.android.gms.cast.metadata.RELEASE_DATE");
        } else if (i == 4) {
            Collections.addAll(arrayList, "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.ARTIST", "com.google.android.gms.cast.metadata.LOCATION_NAME", "com.google.android.gms.cast.metadata.LOCATION_LATITUDE", "com.google.android.gms.cast.metadata.LOCATION_LONGITUDE", "com.google.android.gms.cast.metadata.WIDTH", "com.google.android.gms.cast.metadata.HEIGHT", "com.google.android.gms.cast.metadata.CREATION_DATE");
        } else if (i == 5) {
            Collections.addAll(arrayList, "com.google.android.gms.cast.metadata.CHAPTER_TITLE", "com.google.android.gms.cast.metadata.CHAPTER_NUMBER", "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.BOOK_TITLE", "com.google.android.gms.cast.metadata.SUBTITLE");
        }
        Collections.addAll(arrayList, "com.google.android.gms.cast.metadata.SECTION_DURATION", "com.google.android.gms.cast.metadata.SECTION_START_TIME_IN_MEDIA", "com.google.android.gms.cast.metadata.SECTION_START_ABSOLUTE_TIME", "com.google.android.gms.cast.metadata.SECTION_START_TIME_IN_CONTAINER", "com.google.android.gms.cast.metadata.QUEUE_ITEM_ID");
        HashSet hashSet = new HashSet(arrayList);
        try {
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                if (next != null && !"metadataType".equals(next)) {
                    C5991l c5991l = f2920l;
                    String str = (String) ((HashMap) c5991l.f12715l).get(next);
                    if (str == null) {
                        Object obj = jSONObject.get(next);
                        if (obj instanceof String) {
                            bundle.putString(next, (String) obj);
                        } else if (obj instanceof Integer) {
                            bundle.putInt(next, ((Integer) obj).intValue());
                        } else if (obj instanceof Double) {
                            bundle.putDouble(next, ((Double) obj).doubleValue());
                        }
                    } else if (hashSet.contains(str)) {
                        try {
                            Object obj2 = jSONObject.get(next);
                            if (obj2 != null) {
                                Integer num = (Integer) ((HashMap) c5991l.f12718l).get(str);
                                int iIntValue = num != null ? num.intValue() : 0;
                                if (iIntValue != 1) {
                                    if (iIntValue != 2) {
                                        if (iIntValue == 3) {
                                            double dOptDouble = jSONObject.optDouble(next);
                                            if (!Double.isNaN(dOptDouble)) {
                                                bundle.putDouble(str, dOptDouble);
                                            }
                                        } else if (iIntValue != 4) {
                                            if (iIntValue == 5) {
                                                long jOptLong = jSONObject.optLong(next);
                                                Pattern pattern = AbstractC15091l.yandex;
                                                bundle.putLong(str, jOptLong * 1000);
                                            }
                                        } else if (obj2 instanceof String) {
                                            String str2 = (String) obj2;
                                            if (AbstractC18344l.loadAd(str2) != null) {
                                                bundle.putString(str, str2);
                                            }
                                        }
                                    } else if (obj2 instanceof Integer) {
                                        bundle.putInt(str, ((Integer) obj2).intValue());
                                    }
                                } else if (obj2 instanceof String) {
                                    bundle.putString(str, (String) obj2);
                                }
                            }
                        } catch (JSONException unused2) {
                        }
                    }
                }
            }
        } catch (JSONException unused3) {
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iTapsense = AbstractC9968l.tapsense(parcel, 20293);
        AbstractC9968l.ads(parcel, 2, this.f2924l);
        AbstractC9968l.purchase(parcel, 3, this.f2923l);
        int i2 = this.f2922l;
        AbstractC9968l.subscription(parcel, 4, 4);
        parcel.writeInt(i2);
        AbstractC9968l.Signature(parcel, iTapsense);
    }

    public C1056l(ArrayList arrayList, Bundle bundle, int i) {
        this.f2924l = arrayList;
        this.f2923l = bundle;
        this.f2922l = i;
    }
}
