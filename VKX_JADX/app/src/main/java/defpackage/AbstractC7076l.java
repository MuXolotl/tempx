package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Base64;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import ua.itaysonlab.vkapi2.objects.music.AudioTrack;
import ua.itaysonlab.vkx.R;

/* JADX INFO: renamed from: lؘؚؔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC7076l {
    public static final C15578l yandex = new C15578l(-1220970768, false, new C6971l(3));
    public static final C15578l loadAd = new C15578l(843535577, false, new C6971l(4));

    public static String amazon(Context context, long j) {
        Resources resources = context.getResources();
        long jCurrentTimeMillis = (System.currentTimeMillis() / 1000) - j;
        if (jCurrentTimeMillis < 14400 && jCurrentTimeMillis >= 0) {
            if (jCurrentTimeMillis >= 10800) {
                return resources.getStringArray(R.array.date_ago_hrs)[2];
            }
            if (jCurrentTimeMillis >= 7200) {
                return resources.getStringArray(R.array.date_ago_hrs)[1];
            }
            if (jCurrentTimeMillis >= 3600) {
                return resources.getStringArray(R.array.date_ago_hrs)[0];
            }
            if (jCurrentTimeMillis >= 60) {
                int i = (int) (jCurrentTimeMillis / 60);
                return resources.getQuantityString(R.plurals.date_ago_mins, i, Integer.valueOf(i));
            }
            if (jCurrentTimeMillis <= 10) {
                return resources.getString(R.string.date_ago_now);
            }
            int i2 = (int) jCurrentTimeMillis;
            return resources.getQuantityString(R.plurals.date_ago_secs, i2, Integer.valueOf(i2));
        }
        Resources resources2 = context.getResources();
        long j2 = j * 1000;
        Calendar calendar = Calendar.getInstance();
        int i3 = calendar.get(1);
        calendar.set(12, 0);
        calendar.set(11, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        long timeInMillis = calendar.getTimeInMillis();
        long j3 = timeInMillis + 86400000;
        long j4 = timeInMillis - 86400000;
        calendar.setTimeInMillis(j2);
        long j5 = timeInMillis + 172799999;
        if (j3 <= j2 && j2 <= j5) {
            return String.format(Locale.ENGLISH, "%s %s %d:%02d", Arrays.copyOf(new Object[]{resources2.getString(R.string.tomorrow), resources2.getString(calendar.get(11) == 1 ? R.string.date_at_1am : R.string.date_at), Integer.valueOf(calendar.get(11)), Integer.valueOf(calendar.get(12))}, 4));
        }
        long j6 = timeInMillis + 86399999;
        if (timeInMillis <= j2 && j2 <= j6) {
            return String.format(Locale.ENGLISH, "%s %s %d:%02d", Arrays.copyOf(new Object[]{resources2.getString(R.string.today), resources2.getString(calendar.get(11) == 1 ? R.string.date_at_1am : R.string.date_at), Integer.valueOf(calendar.get(11)), Integer.valueOf(calendar.get(12))}, 4));
        }
        if (j2 >= j4 && j2 < timeInMillis) {
            return String.format(Locale.ENGLISH, "%s %s %d:%02d", Arrays.copyOf(new Object[]{resources2.getString(R.string.yesterday), resources2.getString(calendar.get(11) == 1 ? R.string.date_at_1am : R.string.date_at), Integer.valueOf(calendar.get(11)), Integer.valueOf(calendar.get(12))}, 4));
        }
        return AbstractC5020l.license(new Object[]{resources2.getString(calendar.get(11) == 1 ? R.string.date_at_1am : R.string.date_at), Integer.valueOf(calendar.get(11)), Integer.valueOf(calendar.get(12))}, 3, Locale.ENGLISH, " %s %d:%02d", AbstractC5020l.ad(calendar.get(1) != i3 ? resources2.getString(R.string.date_format_day_month_year, Integer.valueOf(calendar.get(5)), resources2.getStringArray(R.array.date_shortmonths)[Math.min(calendar.get(2), 11)], Integer.valueOf(calendar.get(1))) : resources2.getString(R.string.date_format_day_month, Integer.valueOf(calendar.get(5)), resources2.getStringArray(R.array.date_shortmonths)[Math.min(calendar.get(2), 11)])));
    }

    public static void isPro(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        int i = 1;
        while (i > 0) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i++;
            } else if (next == 3) {
                i--;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v12, types: [android.content.res.TypedArray] */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8, types: [android.content.res.TypedArray] */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v13 */
    public static InterfaceC9684l mopub(XmlResourceParser xmlResourceParser, Resources resources) {
        int next;
        int i;
        ?? r3;
        Throwable th;
        ?? r4;
        do {
            next = xmlResourceParser.next();
            i = 2;
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        xmlResourceParser.require(2, null, "font-family");
        if (!xmlResourceParser.getName().equals("font-family")) {
            isPro(xmlResourceParser);
            return null;
        }
        TypedArray typedArrayObtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), AbstractC6368l.loadAd);
        int i2 = 0;
        String string = typedArrayObtainAttributes.getString(0);
        String string2 = typedArrayObtainAttributes.getString(5);
        String string3 = typedArrayObtainAttributes.getString(6);
        String string4 = typedArrayObtainAttributes.getString(2);
        int resourceId = typedArrayObtainAttributes.getResourceId(1, 0);
        int i3 = 3;
        int integer = typedArrayObtainAttributes.getInteger(3, 1);
        int integer2 = typedArrayObtainAttributes.getInteger(4, 500);
        String string5 = typedArrayObtainAttributes.getString(7);
        typedArrayObtainAttributes.recycle();
        if (string == null || string2 == null) {
            ArrayList arrayList = new ArrayList();
            while (xmlResourceParser.next() != 3) {
                if (xmlResourceParser.getEventType() == 2) {
                    if (xmlResourceParser.getName().equals("font")) {
                        TypedArray typedArrayObtainAttributes2 = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), AbstractC6368l.crashlytics);
                        int i4 = typedArrayObtainAttributes2.getInt(typedArrayObtainAttributes2.hasValue(8) ? 8 : 1, 400);
                        boolean z = 1 == typedArrayObtainAttributes2.getInt(typedArrayObtainAttributes2.hasValue(6) ? 6 : 2, 0);
                        int i5 = typedArrayObtainAttributes2.hasValue(9) ? 9 : 3;
                        String string6 = typedArrayObtainAttributes2.getString(typedArrayObtainAttributes2.hasValue(7) ? 7 : 4);
                        int i6 = typedArrayObtainAttributes2.getInt(i5, 0);
                        int i7 = typedArrayObtainAttributes2.hasValue(5) ? 5 : 0;
                        int resourceId2 = typedArrayObtainAttributes2.getResourceId(i7, 0);
                        String string7 = typedArrayObtainAttributes2.getString(i7);
                        typedArrayObtainAttributes2.recycle();
                        while (xmlResourceParser.next() != 3) {
                            isPro(xmlResourceParser);
                        }
                        arrayList.add(new C11221l(string7, i4, z, string6, i6, resourceId2));
                    } else {
                        isPro(xmlResourceParser);
                    }
                }
            }
            if (arrayList.isEmpty()) {
                return null;
            }
            return new C16926l((C11221l[]) arrayList.toArray(new C11221l[0]));
        }
        List listSubs = subs(resources, resourceId);
        ArrayList arrayList2 = new ArrayList();
        while (xmlResourceParser.next() != i3) {
            if (xmlResourceParser.getEventType() == i) {
                if (xmlResourceParser.getName().equals("fallback")) {
                    TypedArray typedArrayObtainAttributes3 = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), AbstractC6368l.amazon);
                    try {
                        String string8 = typedArrayObtainAttributes3.getString(i2);
                        String string9 = typedArrayObtainAttributes3.getString(1);
                        String string10 = typedArrayObtainAttributes3.getString(i);
                        if (string8 == null) {
                            r3 = typedArrayObtainAttributes3;
                            throw new XmlPullParserException("query attribute must be set in fallback element");
                        }
                        while (xmlResourceParser.next() != i3) {
                            try {
                                isPro(xmlResourceParser);
                            } catch (Throwable th2) {
                                th = th2;
                                r4 = typedArrayObtainAttributes3;
                            }
                        }
                        r3 = typedArrayObtainAttributes3;
                        try {
                            C17129l c17129l = new C17129l(string, string2, string8, listSubs, string9, string10);
                            if (r3 instanceof AutoCloseable) {
                                ((AutoCloseable) r3).close();
                            } else if (r3 instanceof ExecutorService) {
                                AbstractC14238l.subscription((ExecutorService) r3);
                            } else {
                                r3.recycle();
                            }
                            arrayList2.add(c17129l);
                        } catch (Throwable th3) {
                            th = th3;
                        }
                        th = th3;
                    } catch (Throwable th4) {
                        th = th4;
                        r3 = typedArrayObtainAttributes3;
                    }
                    th = th;
                    r4 = r3;
                    if (r4 == 0) {
                        throw th;
                    }
                    try {
                        if (r4 instanceof AutoCloseable) {
                            ((AutoCloseable) r4).close();
                        } else if (r4 instanceof ExecutorService) {
                            AbstractC14238l.subscription((ExecutorService) r4);
                        } else {
                            r4.recycle();
                        }
                        throw th;
                    } catch (Throwable th5) {
                        th.addSuppressed(th5);
                        throw th;
                    }
                }
                isPro(xmlResourceParser);
                integer = integer;
                i = 2;
                i2 = 0;
                i3 = 3;
            }
        }
        int i8 = integer;
        if (!arrayList2.isEmpty()) {
            return new C7919l(arrayList2, i8, integer2, string5);
        }
        if (string3 == null) {
            C8339l.metrica("The provider font XML requires query attribute or fallback children.");
            return null;
        }
        arrayList2.add(new C17129l(string, string2, string3, listSubs, null, null));
        if (string4 != null) {
            arrayList2.add(new C17129l(string, string2, string4, listSubs, null, null));
        }
        return new C7919l(arrayList2, i8, integer2, string5);
    }

    public static List subs(Resources resources, int i) {
        if (i == 0) {
            return Collections.EMPTY_LIST;
        }
        TypedArray typedArrayObtainTypedArray = resources.obtainTypedArray(i);
        try {
            if (typedArrayObtainTypedArray.length() == 0) {
                return Collections.EMPTY_LIST;
            }
            ArrayList arrayList = new ArrayList();
            if (typedArrayObtainTypedArray.getType(0) == 1) {
                for (int i2 = 0; i2 < typedArrayObtainTypedArray.length(); i2++) {
                    int resourceId = typedArrayObtainTypedArray.getResourceId(i2, 0);
                    if (resourceId != 0) {
                        String[] stringArray = resources.getStringArray(resourceId);
                        ArrayList arrayList2 = new ArrayList();
                        for (String str : stringArray) {
                            arrayList2.add(Base64.decode(str, 0));
                        }
                        arrayList.add(arrayList2);
                    }
                }
            } else {
                String[] stringArray2 = resources.getStringArray(i);
                ArrayList arrayList3 = new ArrayList();
                for (String str2 : stringArray2) {
                    arrayList3.add(Base64.decode(str2, 0));
                }
                arrayList.add(arrayList3);
            }
            return arrayList;
        } finally {
            typedArrayObtainTypedArray.recycle();
        }
    }

    public abstract ImageView admob(InterfaceC0589l interfaceC0589l);

    public abstract void billing(InterfaceC0589l interfaceC0589l);

    public abstract InterfaceC0589l crashlytics(LayoutInflater layoutInflater, ViewGroup viewGroup);

    public abstract void loadAd(InterfaceC0589l interfaceC0589l, AudioTrack audioTrack, int i);

    public abstract int purchase();

    public void yandex(InterfaceC0589l interfaceC0589l, boolean z) {
    }
}
