package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import android.webkit.MimeTypeMap;
import java.util.Locale;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: renamed from: lؚّۨ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C13020l implements InterfaceC14142l {
    public final C15106l crashlytics;
    public final C16060l loadAd;
    public final /* synthetic */ int yandex;

    public /* synthetic */ C13020l(C16060l c16060l, C15106l c15106l, int i) {
        this.yandex = i;
        this.loadAd = c16060l;
        this.crashlytics = c15106l;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0071  */
    /* JADX WARN: Code duplicated, block: B:48:0x010a  */
    /* JADX WARN: Code duplicated, block: B:67:0x0164  */
    @Override // defpackage.InterfaceC14142l
    public final Object yandex(C6563l c6563l) throws Throwable {
        Integer numSignatures;
        String mimeTypeFromExtension;
        Drawable drawable;
        Drawable c9437l;
        int i = this.yandex;
        C16060l c16060l = this.loadAd;
        C15106l c15106l = this.crashlytics;
        String mimeTypeFromExtension2 = null;
        switch (i) {
            case 0:
                String strM4210case = AbstractC16901l.m4210case(AbstractC16901l.m4233package(1, AbstractC1051l.metrica(c16060l)), "/", null, null, null, 62);
                C7035l c7035l = new C7035l(new C1503l(AbstractC7709l.purchase(c15106l.yandex.getAssets().open(strM4210case))), c15106l.billing, new C2951l(strM4210case));
                if (!AbstractC12024l.m3315catch(strM4210case)) {
                    String strM3317const = AbstractC12024l.m3317const(AbstractC12024l.m3317const(strM4210case, '#'), '?');
                    String strM3348transient = AbstractC12024l.m3348transient('.', AbstractC12024l.m3348transient('/', strM3317const, strM3317const), "");
                    if (!AbstractC12024l.m3315catch(strM3348transient)) {
                        String lowerCase = strM3348transient.toLowerCase(Locale.ROOT);
                        mimeTypeFromExtension2 = (String) AbstractC10189l.yandex.get(lowerCase);
                        if (mimeTypeFromExtension2 == null) {
                            mimeTypeFromExtension2 = MimeTypeMap.getSingleton().getMimeTypeFromExtension(lowerCase);
                        }
                    }
                }
                return new C6669l(c7035l, mimeTypeFromExtension2, 3);
            case 1:
                String str = c16060l.yandex;
                String str2 = c16060l.yandex;
                int iM3324for = AbstractC12024l.m3324for(str, ";base64,", 0, false, 6);
                if (iM3324for == -1) {
                    C18073l.firebase(c16060l, "invalid data uri: ");
                    return null;
                }
                int iM3321extends = AbstractC12024l.m3321extends(str2, ':', 0, 6);
                if (iM3321extends == -1) {
                    C18073l.firebase(c16060l, "invalid data uri: ");
                    return null;
                }
                String strSubstring = str2.substring(iM3321extends + 1, iM3324for);
                byte[] bArrYandex = C7714l.yandex(C7714l.billing, str2, iM3324for + 8, 4);
                C0869l c0869l = new C0869l();
                c0869l.m738write(bArrYandex);
                return new C6669l(AbstractC17291l.loadAd(c0869l, c15106l.billing), strSubstring, 2);
            case 2:
                String str3 = C14025l.f27330l;
                String strVip = AbstractC1051l.vip(c16060l);
                if (strVip == null) {
                    C8339l.smaato("filePath == null");
                    return null;
                }
                C14025l c14025lAdcel = C6162l.adcel(strVip, false);
                C16218l c16218lYandex = AbstractC17291l.yandex(c14025lAdcel, c15106l.billing, null, null, 28);
                String strM3348transient2 = AbstractC12024l.m3348transient('.', c14025lAdcel.loadAd(), "");
                if (!AbstractC12024l.m3315catch(strM3348transient2)) {
                    String lowerCase2 = strM3348transient2.toLowerCase(Locale.ROOT);
                    mimeTypeFromExtension2 = (String) AbstractC10189l.yandex.get(lowerCase2);
                    if (mimeTypeFromExtension2 == null) {
                        mimeTypeFromExtension2 = MimeTypeMap.getSingleton().getMimeTypeFromExtension(lowerCase2);
                    }
                }
                return new C6669l(c16218lYandex, mimeTypeFromExtension2, 3);
            case 3:
                String str4 = c16060l.purchase;
                if (str4 == null) {
                    str4 = "";
                }
                int iM3321extends2 = AbstractC12024l.m3321extends(str4, '!', 0, 6);
                if (iM3321extends2 == -1) {
                    C18073l.firebase(c16060l, "Invalid jar:file URI: ");
                    return null;
                }
                String str5 = C14025l.f27330l;
                C14025l c14025lAdcel2 = C6162l.adcel(str4.substring(0, iM3321extends2), false);
                C14025l c14025lAdcel3 = C6162l.adcel(str4.substring(iM3321extends2 + 1, str4.length()), false);
                C16218l c16218lYandex2 = AbstractC17291l.yandex(c14025lAdcel3, AbstractC13628l.admob(c14025lAdcel2, c15106l.billing, new C8125l(20)), null, null, 28);
                String strM3348transient3 = AbstractC12024l.m3348transient('.', c14025lAdcel3.loadAd(), "");
                if (!AbstractC12024l.m3315catch(strM3348transient3)) {
                    String lowerCase3 = strM3348transient3.toLowerCase(Locale.ROOT);
                    mimeTypeFromExtension2 = (String) AbstractC10189l.yandex.get(lowerCase3);
                    if (mimeTypeFromExtension2 == null) {
                        mimeTypeFromExtension2 = MimeTypeMap.getSingleton().getMimeTypeFromExtension(lowerCase3);
                    }
                }
                return new C6669l(c16218lYandex2, mimeTypeFromExtension2, 3);
            default:
                String str6 = c16060l.amazon;
                if (str6 != null) {
                    if (AbstractC12024l.m3315catch(str6)) {
                        str6 = null;
                    }
                    if (str6 != null) {
                        String str7 = (String) AbstractC16901l.m4212class(AbstractC1051l.metrica(c16060l));
                        if (str7 == null || (numSignatures = AbstractC16648l.signatures(str7)) == null) {
                            C11983l.ad(c16060l, "Invalid android.resource URI: ");
                            return null;
                        }
                        int iIntValue = numSignatures.intValue();
                        Context context = c15106l.yandex;
                        Resources resources = str6.equals(context.getPackageName()) ? context.getResources() : context.getPackageManager().getResourcesForApplication(str6);
                        TypedValue typedValue = new TypedValue();
                        resources.getValue(iIntValue, typedValue, true);
                        String string = typedValue.string.toString();
                        if (AbstractC12024l.m3315catch(string)) {
                            mimeTypeFromExtension = null;
                        } else {
                            String strM3317const2 = AbstractC12024l.m3317const(AbstractC12024l.m3317const(string, '#'), '?');
                            String strM3348transient4 = AbstractC12024l.m3348transient('.', AbstractC12024l.m3348transient('/', strM3317const2, strM3317const2), "");
                            if (AbstractC12024l.m3315catch(strM3348transient4)) {
                                mimeTypeFromExtension = null;
                            } else {
                                String lowerCase4 = strM3348transient4.toLowerCase(Locale.ROOT);
                                mimeTypeFromExtension = (String) AbstractC10189l.yandex.get(lowerCase4);
                                if (mimeTypeFromExtension == null) {
                                    mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(lowerCase4);
                                }
                            }
                        }
                        if (!AbstractC8576l.yandex(mimeTypeFromExtension, "text/xml")) {
                            return new C6669l(new C7035l(new C1503l(AbstractC7709l.purchase(resources.openRawResource(iIntValue, new TypedValue()))), c15106l.billing, new C6677l(str6, iIntValue)), mimeTypeFromExtension, 3);
                        }
                        if (str6.equals(context.getPackageName())) {
                            drawable = AbstractC18377l.crashlytics(context, iIntValue);
                        } else {
                            XmlResourceParser xml = resources.getXml(iIntValue);
                            int next = xml.next();
                            while (next != 2 && next != 1) {
                                next = xml.next();
                            }
                            if (next != 2) {
                                throw new XmlPullParserException("No start tag found.");
                            }
                            if (Build.VERSION.SDK_INT < 24) {
                                String name = xml.getName();
                                if (AbstractC8576l.yandex(name, "vector")) {
                                    AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
                                    Resources.Theme theme = context.getTheme();
                                    c9437l = new C5669l();
                                    c9437l.inflate(resources, xml, attributeSetAsAttributeSet, theme);
                                } else if (AbstractC8576l.yandex(name, "animated-vector")) {
                                    AttributeSet attributeSetAsAttributeSet2 = Xml.asAttributeSet(xml);
                                    Resources.Theme theme2 = context.getTheme();
                                    c9437l = new C9437l(context, 0);
                                    c9437l.inflate(resources, xml, attributeSetAsAttributeSet2, theme2);
                                } else {
                                    Resources.Theme theme3 = context.getTheme();
                                    ThreadLocal threadLocal = AbstractC7525l.yandex;
                                    drawable = resources.getDrawable(iIntValue, theme3);
                                    if (drawable == null) {
                                        C8936l.subs(AbstractC0653l.vip(iIntValue, "Invalid resource ID: "));
                                        return null;
                                    }
                                }
                                drawable = c9437l;
                            } else {
                                Resources.Theme theme4 = context.getTheme();
                                ThreadLocal threadLocal2 = AbstractC7525l.yandex;
                                drawable = resources.getDrawable(iIntValue, theme4);
                                if (drawable == null) {
                                    C8936l.subs(AbstractC0653l.vip(iIntValue, "Invalid resource ID: "));
                                    return null;
                                }
                            }
                        }
                        Drawable bitmapDrawable = drawable;
                        Bitmap.Config[] configArr = AbstractC4032l.yandex;
                        boolean z = (bitmapDrawable instanceof VectorDrawable) || (bitmapDrawable instanceof C5669l);
                        if (z) {
                            bitmapDrawable = new BitmapDrawable(context.getResources(), AbstractC4072l.license(bitmapDrawable, (Bitmap.Config) AbstractC0532l.amazon(c15106l, AbstractC10413l.loadAd), c15106l.loadAd, c15106l.crashlytics, (C9192l) AbstractC0532l.amazon(c15106l, AbstractC12872l.loadAd), c15106l.amazon == 2));
                        }
                        return new C9245l(AbstractC3230l.crashlytics(bitmapDrawable), z, 3);
                    }
                }
                C11983l.ad(c16060l, "Invalid android.resource URI: ");
                return null;
        }
    }
}
