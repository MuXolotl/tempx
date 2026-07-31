package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import android.text.ParcelableSpan;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.text.style.TypefaceSpan;
import android.text.style.URLSpan;
import android.text.util.Linkify;
import android.util.Log;
import android.util.SizeF;
import android.widget.RemoteViews;
import android.widget.TextView;
import j$.util.DesugarCollections;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import ua.itaysonlab.vkxreborn.cache.realm.CachedAlbum;
import ua.itaysonlab.vkxreborn.cache.realm.CachedPlaylist;
import ua.itaysonlab.vkxreborn.cache.realm.CachedTrack;

/* JADX INFO: renamed from: lؗۧۦ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC5309l {
    public static final C2351l yandex = new C2351l(21);

    public static final void admob(RemoteViews remoteViews, C4372l c4372l, C5697l c5697l, List list) {
        int i = 0;
        for (Object obj : AbstractC16901l.m4247try(list, 10)) {
            int i2 = i + 1;
            if (i < 0) {
                AbstractC14055l.subscription();
                throw null;
            }
            isPro(remoteViews, c4372l.loadAd(c5697l, i), (InterfaceC9708l) obj);
            i = i2;
        }
    }

    public static final C14025l amazon(CachedTrack cachedTrack) {
        String strRemoteconfig;
        if (!cachedTrack.appmetrica()) {
            return null;
        }
        if (cachedTrack.applovin()) {
            return AbstractC0825l.admob(3, cachedTrack.m4635implements());
        }
        if (cachedTrack.m4646strictfp()) {
            return AbstractC0825l.admob(2, cachedTrack.m4635implements());
        }
        CachedAlbum cachedAlbumYandex = cachedTrack.yandex();
        if (cachedAlbumYandex == null || (strRemoteconfig = cachedAlbumYandex.remoteconfig()) == null) {
            return null;
        }
        return AbstractC0825l.admob(4, strRemoteconfig);
    }

    public static final boolean billing(InterfaceC2957l interfaceC2957l) {
        Field fieldMetrica;
        if (interfaceC2957l instanceof InterfaceC4469l) {
            InterfaceC2957l interfaceC2957lLoadAd = AbstractC5592l.loadAd(interfaceC2957l);
            fieldMetrica = interfaceC2957lLoadAd != null ? interfaceC2957lLoadAd.metrica() : null;
            if (!(fieldMetrica != null ? fieldMetrica.isAccessible() : true)) {
                return false;
            }
            Method methodMetrica = AbstractC13095l.metrica(interfaceC2957l.crashlytics());
            if (!(methodMetrica != null ? methodMetrica.isAccessible() : true)) {
                return false;
            }
            Method methodMetrica2 = AbstractC13095l.metrica(((InterfaceC4469l) interfaceC2957l).amazon());
            if (!(methodMetrica2 != null ? methodMetrica2.isAccessible() : true)) {
                return false;
            }
        } else {
            InterfaceC2957l interfaceC2957lLoadAd2 = AbstractC5592l.loadAd(interfaceC2957l);
            fieldMetrica = interfaceC2957lLoadAd2 != null ? interfaceC2957lLoadAd2.metrica() : null;
            if (!(fieldMetrica != null ? fieldMetrica.isAccessible() : true)) {
                return false;
            }
            Method methodMetrica3 = AbstractC13095l.metrica(interfaceC2957l.crashlytics());
            if (!(methodMetrica3 != null ? methodMetrica3.isAccessible() : true)) {
                return false;
            }
        }
        return true;
    }

    public static final C14025l crashlytics(CachedPlaylist cachedPlaylist) {
        return AbstractC0825l.admob(cachedPlaylist.m4608private() ? 1 : 5, cachedPlaylist.m4618throws());
    }

    public static final RemoteViews firebase(Context context, int i, C14524l c14524l, C6045l c6045l, int i2, ComponentName componentName, C0458l c0458l) {
        boolean z = true;
        if (context.getResources().getConfiguration().getLayoutDirection() != 1) {
            z = false;
        }
        C4372l c4372l = new C4372l(context, i, z, c6045l, -1, false, new AtomicInteger(-1), new C5697l(0, 0, null, 7), new AtomicBoolean(false), 9205357640488583168L, -1, false, null, componentName, c0458l);
        ArrayList<InterfaceC9708l> arrayList = c14524l.loadAd;
        if (arrayList == null || !arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (!(((InterfaceC9708l) it.next()) instanceof C0032l)) {
                    InterfaceC9708l interfaceC9708l = (InterfaceC9708l) AbstractC16901l.m4208abstract(arrayList);
                    C8683l c8683lYandex = AbstractC5267l.yandex(c4372l, interfaceC9708l.loadAd(), i2);
                    RemoteViews remoteViews = c8683lYandex.yandex;
                    isPro(remoteViews, C4372l.yandex(c4372l.loadAd(c8683lYandex.loadAd, 0), 0, new AtomicInteger(-1), null, new AtomicBoolean(false), 0L, null, 65215), interfaceC9708l);
                    return remoteViews;
                }
            }
        }
        InterfaceC18579l interfaceC18579l = ((C0032l) AbstractC16901l.m4231native(arrayList)).amazon;
        ArrayList arrayList2 = new ArrayList(AbstractC14055l.billing(arrayList, 10));
        for (InterfaceC9708l interfaceC9708l2 : arrayList) {
            C0032l c0032l = (C0032l) interfaceC9708l2;
            long j = c0032l.crashlytics;
            C8683l c8683lYandex2 = AbstractC5267l.yandex(c4372l, c0032l.loadAd(), i2);
            RemoteViews remoteViews2 = c8683lYandex2.yandex;
            isPro(remoteViews2, C4372l.yandex(c4372l.loadAd(c8683lYandex2.loadAd, 0), 0, new AtomicInteger(-1), null, new AtomicBoolean(false), j, null, 64703), interfaceC9708l2);
            arrayList2.add(new C8195l(new SizeF(C2261l.loadAd(j), C2261l.yandex(j)), remoteViews2));
        }
        if (interfaceC18579l instanceof C7261l) {
            return (RemoteViews) ((C8195l) AbstractC16901l.m4208abstract(arrayList2)).f17097l;
        }
        if (!(interfaceC18579l instanceof C18698l) && !AbstractC8576l.yandex(interfaceC18579l, C13418l.yandex)) {
            C18725l.billing();
            return null;
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return AbstractC12148l.amazon(AbstractC8676l.subscription(arrayList2));
        }
        if (arrayList2.size() != 1 && arrayList2.size() != 2) {
            C8339l.metrica("unsupported views size");
            return null;
        }
        ArrayList arrayList3 = new ArrayList(AbstractC14055l.billing(arrayList2, 10));
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            arrayList3.add((RemoteViews) ((C8195l) it2.next()).f17097l);
        }
        int size = arrayList3.size();
        if (size == 1) {
            return (RemoteViews) arrayList3.get(0);
        }
        if (size == 2) {
            return new RemoteViews((RemoteViews) arrayList3.get(0), (RemoteViews) arrayList3.get(1));
        }
        C8339l.metrica("There must be between 1 and 2 views.");
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:133:0x032d  */
    public static final void isPro(RemoteViews remoteViews, C4372l c4372l, InterfaceC9708l interfaceC9708l) {
        EnumC18024l enumC18024l;
        Context context = c4372l.yandex;
        if (interfaceC9708l instanceof C5500l) {
            C5500l c5500l = (C5500l) interfaceC9708l;
            ArrayList<InterfaceC9708l> arrayList = c5500l.loadAd;
            int size = arrayList.size();
            InterfaceC12001l interfaceC12001l = c5500l.crashlytics;
            C9224l c9224l = c5500l.amazon;
            C5697l c5697lLoadAd = AbstractC5267l.loadAd(remoteViews, c4372l, EnumC18024l.f35233l, size, interfaceC12001l, new C12347l(c9224l.yandex), new C15667l(c9224l.loadAd));
            AbstractC7236l.yandex(c4372l, remoteViews, c5500l.crashlytics, c5697lLoadAd);
            for (InterfaceC9708l interfaceC9708l2 : arrayList) {
                interfaceC9708l2.crashlytics(interfaceC9708l2.loadAd().billing(new C14732l(c5500l.amazon)));
            }
            admob(remoteViews, c4372l, c5697lLoadAd, arrayList);
            return;
        }
        if (interfaceC9708l instanceof C10761l) {
            C10761l c10761l = (C10761l) interfaceC9708l;
            EnumC18024l enumC18024l2 = (Build.VERSION.SDK_INT < 31 || !AbstractC12098l.purchase(c10761l.crashlytics)) ? EnumC18024l.f35241l : EnumC18024l.f35244l;
            ArrayList<InterfaceC9708l> arrayList2 = c10761l.loadAd;
            C5697l c5697lLoadAd2 = AbstractC5267l.loadAd(remoteViews, c4372l, enumC18024l2, arrayList2.size(), c10761l.crashlytics, null, new C15667l(c10761l.purchase));
            remoteViews.setInt(c5697lLoadAd2.yandex, "setGravity", subs(new C9224l(c10761l.amazon, c10761l.purchase)));
            AbstractC7236l.yandex(C4372l.yandex(c4372l, 0, null, null, null, 0L, null, 61439), remoteViews, c10761l.crashlytics, c5697lLoadAd2);
            admob(remoteViews, c4372l, c5697lLoadAd2, arrayList2);
            if (AbstractC12098l.purchase(c10761l.crashlytics)) {
                if (arrayList2 == null || !arrayList2.isEmpty()) {
                    for (InterfaceC9708l interfaceC9708l3 : arrayList2) {
                    }
                    return;
                }
                return;
            }
            return;
        }
        if (interfaceC9708l instanceof C3480l) {
            C3480l c3480l = (C3480l) interfaceC9708l;
            EnumC18024l enumC18024l3 = (Build.VERSION.SDK_INT < 31 || !AbstractC12098l.purchase(c3480l.crashlytics)) ? EnumC18024l.f35240l : EnumC18024l.f35250l;
            ArrayList<InterfaceC9708l> arrayList3 = c3480l.loadAd;
            C5697l c5697lLoadAd3 = AbstractC5267l.loadAd(remoteViews, c4372l, enumC18024l3, arrayList3.size(), c3480l.crashlytics, new C12347l(c3480l.purchase), null);
            remoteViews.setInt(c5697lLoadAd3.yandex, "setGravity", subs(new C9224l(c3480l.purchase, c3480l.amazon)));
            AbstractC7236l.yandex(C4372l.yandex(c4372l, 0, null, null, null, 0L, null, 61439), remoteViews, c3480l.crashlytics, c5697lLoadAd3);
            admob(remoteViews, c4372l, c5697lLoadAd3, arrayList3);
            if (AbstractC12098l.purchase(c3480l.crashlytics)) {
                if (arrayList3 == null || !arrayList3.isEmpty()) {
                    for (InterfaceC9708l interfaceC9708l4 : arrayList3) {
                    }
                    return;
                }
                return;
            }
            return;
        }
        boolean z = false;
        if (interfaceC9708l instanceof C6958l) {
            C6958l c6958l = (C6958l) interfaceC9708l;
            C5697l c5697lCrashlytics = AbstractC5267l.crashlytics(remoteViews, c4372l, EnumC18024l.f35249l, c6958l.amazon);
            int i = c5697lCrashlytics.yandex;
            CharSequence charSequence = c6958l.yandex;
            C12373l c12373l = c6958l.loadAd;
            int i2 = c6958l.crashlytics;
            if (i2 != Integer.MAX_VALUE) {
                remoteViews.setInt(i, "setMaxLines", i2);
            }
            if (c12373l == null) {
                remoteViews.setTextViewText(i, charSequence);
            } else {
                SpannableString spannableString = new SpannableString(charSequence);
                int length = spannableString.length();
                C1794l c1794l = c12373l.loadAd;
                if (c1794l != null) {
                    long j = c1794l.yandex;
                    if ((1095216660480L & j) != 4294967296L) {
                        C8339l.metrica("Only Sp is currently supported for font sizes");
                        return;
                    }
                    remoteViews.setTextViewTextSize(i, 2, C1794l.crashlytics(j));
                }
                ArrayList arrayList4 = new ArrayList();
                C18176l c18176l = c12373l.crashlytics;
                if (c18176l != null) {
                    arrayList4.add(new TypefaceSpan(c18176l.f35617l));
                }
                Iterator it = arrayList4.iterator();
                while (it.hasNext()) {
                    spannableString.setSpan((ParcelableSpan) it.next(), 0, length, 17);
                }
                remoteViews.setTextViewText(i, spannableString);
                InterfaceC15725l interfaceC15725l = c12373l.yandex;
                if (interfaceC15725l instanceof C6293l) {
                    remoteViews.setTextColor(i, AbstractC12953l.startapp(((C6293l) interfaceC15725l).yandex));
                } else if (!(interfaceC15725l instanceof C2620l)) {
                    Log.w("GlanceAppWidget", "Unexpected text color: " + interfaceC15725l);
                } else if (Build.VERSION.SDK_INT >= 31) {
                    AbstractC7227l.mopub(remoteViews, i, "setTextColor", ((C2620l) interfaceC15725l).yandex);
                } else {
                    remoteViews.setTextColor(i, AbstractC12953l.startapp(AbstractC12953l.loadAd(context.getColor(((C2620l) interfaceC15725l).yandex))));
                }
            }
            AbstractC7236l.yandex(c4372l, remoteViews, c6958l.amazon, c5697lCrashlytics);
            return;
        }
        if (!(interfaceC9708l instanceof C13074l)) {
            if (!(interfaceC9708l instanceof C0032l)) {
                C18262l.startapp(interfaceC9708l.getClass().getCanonicalName(), "Unknown element type ");
                return;
            }
            ArrayList arrayList5 = ((C0032l) interfaceC9708l).loadAd;
            if (arrayList5.size() <= 1) {
                InterfaceC9708l interfaceC9708l5 = (InterfaceC9708l) AbstractC16901l.m4217extends(arrayList5);
                if (interfaceC9708l5 != null) {
                    isPro(remoteViews, c4372l, interfaceC9708l5);
                    return;
                }
                return;
            }
            throw new IllegalArgumentException(("Size boxes can only have at most one child " + arrayList5.size() + ". The normalization of the composition tree failed.").toString());
        }
        C13074l c13074l = (C13074l) interfaceC9708l;
        boolean zBilling = C10053l.billing(c13074l);
        int i3 = c13074l.purchase;
        if (i3 == 0) {
            enumC18024l = zBilling ? EnumC18024l.f35259l : EnumC18024l.f35236l;
        } else {
            EnumC18024l enumC18024l4 = EnumC18024l.f35235l;
            if (i3 == 1) {
                enumC18024l = zBilling ? EnumC18024l.f35239l : enumC18024l4;
            } else if (i3 == 2) {
                enumC18024l = zBilling ? EnumC18024l.f35245l : EnumC18024l.f35231l;
            } else {
                Log.w("GlanceAppWidget", "Unsupported ContentScale user: " + ((Object) C0219l.yandex(c13074l.purchase)));
            }
        }
        C5697l c5697lCrashlytics2 = AbstractC5267l.crashlytics(remoteViews, c4372l, enumC18024l, c13074l.yandex);
        int i4 = c5697lCrashlytics2.yandex;
        InterfaceC17045l interfaceC17045l = c13074l.loadAd;
        if (interfaceC17045l instanceof C7552l) {
            remoteViews.setImageViewResource(i4, ((C7552l) interfaceC17045l).yandex);
        } else {
            if (!(interfaceC17045l instanceof C12826l)) {
                C8339l.metrica("An unsupported ImageProvider type was used.");
                return;
            }
            remoteViews.setImageViewBitmap(i4, ((C12826l) interfaceC17045l).yandex);
        }
        C12922l c12922l = c13074l.crashlytics;
        if (c12922l != null) {
            if (!(c12922l instanceof C12922l)) {
                C8339l.metrica("An unsupported ColorFilter was used.");
                return;
            }
            InterfaceC15725l interfaceC15725l2 = c12922l.yandex;
            if (Build.VERSION.SDK_INT < 31 || !(interfaceC15725l2 instanceof C2620l)) {
                remoteViews.setInt(i4, "setColorFilter", AbstractC12953l.startapp(interfaceC15725l2.yandex(context)));
            } else {
                AbstractC7227l.amazon(remoteViews, i4, "setColorFilter", ((C2620l) interfaceC15725l2).yandex);
            }
        }
        Float f = c13074l.amazon;
        if (f != null) {
            remoteViews.setInt(i4, "setImageAlpha", AbstractC8576l.purchase((int) Math.rint(AbstractC8576l.amazon(f.floatValue(), 0.0f, 1.0f) * 255.0f), 0, 255));
        }
        AbstractC7236l.yandex(c4372l, remoteViews, c13074l.yandex, c5697lCrashlytics2);
        if (c13074l.purchase == 1) {
            C8079l c8079l = (C8079l) c13074l.yandex.purchase(null, C15460l.f30252l);
            AbstractC11876l abstractC11876l = c8079l != null ? c8079l.yandex : null;
            C10365l c10365l = C10365l.yandex;
            if (AbstractC8576l.yandex(abstractC11876l, c10365l)) {
                z = true;
            } else {
                C4538l c4538l = (C4538l) c13074l.yandex.purchase(null, C15460l.f30233l);
                if (AbstractC8576l.yandex(c4538l != null ? c4538l.yandex : null, c10365l)) {
                    z = true;
                }
            }
        }
        remoteViews.setBoolean(i4, "setAdjustViewBounds", z);
    }

    public static boolean loadAd(Spannable spannable) {
        int i;
        int i2;
        int i3;
        boolean z;
        C12245l c12245l;
        boolean z2;
        boolean z3 = true;
        if (Build.VERSION.SDK_INT >= 28) {
            return Linkify.addLinks(spannable, 1);
        }
        Object[] objArr = (URLSpan[]) spannable.getSpans(0, spannable.length(), URLSpan.class);
        for (int length = objArr.length - 1; length >= 0; length--) {
            spannable.removeSpan(objArr[length]);
        }
        ArrayList<C12245l> arrayList = new ArrayList();
        Pattern pattern = AbstractC9390l.yandex;
        String[] strArr = {"http://", "https://", "rtsp://"};
        Linkify.MatchFilter matchFilter = Linkify.sUrlMatchFilter;
        Matcher matcher = pattern.matcher(spannable);
        while (matcher.find()) {
            int iStart = matcher.start();
            int iEnd = matcher.end();
            String strGroup = matcher.group(0);
            if ((matchFilter == null || matchFilter.acceptMatch(spannable, iStart, iEnd)) && strGroup != null) {
                C12245l c12245l2 = new C12245l();
                int length2 = strArr.length;
                int i4 = 0;
                while (true) {
                    if (i4 >= length2) {
                        z = z3;
                        c12245l = c12245l2;
                        z2 = false;
                        break;
                    }
                    int i5 = i4;
                    String str = strArr[i5];
                    int i6 = length2;
                    z = z3;
                    c12245l = c12245l2;
                    if (strGroup.regionMatches(true, 0, str, 0, str.length())) {
                        if (!strGroup.regionMatches(false, 0, str, 0, str.length())) {
                            strGroup = str.concat(strGroup.substring(str.length()));
                        }
                        z2 = z;
                        break;
                    }
                    i4 = i5 + 1;
                    c12245l2 = c12245l;
                    length2 = i6;
                    z3 = z;
                }
                if (!z2 && strArr.length > 0) {
                    strGroup = AbstractC0653l.ads(new StringBuilder(), strArr[0], strGroup);
                }
                c12245l.loadAd = strGroup;
                c12245l.crashlytics = iStart;
                c12245l.amazon = iEnd;
                arrayList.add(c12245l);
            } else {
                z = z3;
            }
            z3 = z;
        }
        boolean z4 = z3;
        for (URLSpan uRLSpan : (URLSpan[]) spannable.getSpans(0, spannable.length(), URLSpan.class)) {
            C12245l c12245l3 = new C12245l();
            c12245l3.yandex = uRLSpan;
            c12245l3.crashlytics = spannable.getSpanStart(uRLSpan);
            c12245l3.amazon = spannable.getSpanEnd(uRLSpan);
            arrayList.add(c12245l3);
        }
        Collections.sort(arrayList, yandex);
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size - 1) {
            C12245l c12245l4 = (C12245l) arrayList.get(i7);
            int i8 = i7 + 1;
            C12245l c12245l5 = (C12245l) arrayList.get(i8);
            int i9 = c12245l4.crashlytics;
            int i10 = c12245l5.crashlytics;
            if (i9 <= i10 && (i = c12245l4.amazon) > i10) {
                int i11 = c12245l5.amazon;
                int i12 = (i11 > i && (i2 = i - i9) <= (i3 = i11 - i10)) ? i2 < i3 ? i7 : -1 : i8;
                if (i12 != -1) {
                    Object obj = ((C12245l) arrayList.get(i12)).yandex;
                    if (obj != null) {
                        spannable.removeSpan(obj);
                    }
                    arrayList.remove(i12);
                    size--;
                }
            }
            i7 = i8;
        }
        if (arrayList.size() == 0) {
            return false;
        }
        for (C12245l c12245l6 : arrayList) {
            if (c12245l6.yandex == null) {
                spannable.setSpan(new URLSpan(c12245l6.loadAd), c12245l6.crashlytics, c12245l6.amazon, 33);
            }
        }
        return z4;
    }

    public static List mopub(Object... objArr) {
        int length = objArr.length;
        if (length != 0) {
            return length != 1 ? DesugarCollections.unmodifiableList(Arrays.asList(objArr)) : Collections.singletonList(objArr[0]);
        }
        return Collections.EMPTY_LIST;
    }

    public static final C14025l purchase(CachedTrack cachedTrack) {
        return AbstractC0825l.subs(cachedTrack.inmobi() ? 3 : 1, cachedTrack.m4635implements());
    }

    public static final int subs(C9224l c9224l) {
        int i = c9224l.yandex;
        int i2 = 8388611;
        if (i != 0) {
            if (i == 2) {
                i2 = 8388613;
            } else if (i == 1) {
                i2 = 1;
            } else {
                Log.w("GlanceAppWidget", "Unknown horizontal alignment: " + ((Object) C12347l.loadAd(i)));
            }
        }
        int i3 = c9224l.loadAd;
        int i4 = 48;
        if (i3 != 0) {
            if (i3 == 2) {
                i4 = 80;
            } else if (i3 == 1) {
                i4 = 16;
            } else {
                Log.w("GlanceAppWidget", "Unknown vertical alignment: " + ((Object) C15667l.loadAd(i3)));
            }
        }
        return i2 | i4;
    }

    public static void yandex(TextView textView) {
        if (Build.VERSION.SDK_INT >= 28) {
            Linkify.addLinks(textView, 1);
            return;
        }
        CharSequence text = textView.getText();
        if (text instanceof Spannable) {
            if (loadAd((Spannable) text) && !(textView.getMovementMethod() instanceof LinkMovementMethod) && textView.getLinksClickable()) {
                textView.setMovementMethod(LinkMovementMethod.getInstance());
                return;
            }
            return;
        }
        SpannableString spannableStringValueOf = SpannableString.valueOf(text);
        if (loadAd(spannableStringValueOf)) {
            if (!(textView.getMovementMethod() instanceof LinkMovementMethod) && textView.getLinksClickable()) {
                textView.setMovementMethod(LinkMovementMethod.getInstance());
            }
            textView.setText(spannableStringValueOf);
        }
    }
}
