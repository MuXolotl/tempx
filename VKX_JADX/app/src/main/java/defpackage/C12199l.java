package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Xml;
import java.io.IOException;
import java.util.Locale;
import org.xmlpull.v1.XmlPullParserException;
import ua.itaysonlab.vkx.R;

/* JADX INFO: renamed from: lِۢ۠, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C12199l {
    public final float admob;
    public final float amazon;
    public final float billing;
    public final float crashlytics;
    public final int firebase;
    public final int isPro;
    public final C14434l loadAd = new C14434l();
    public final float mopub;
    public final float purchase;
    public final int subs;
    public final C14434l yandex;

    public C12199l(Context context) {
        AttributeSet attributeSetAsAttributeSet;
        int styleAttribute;
        int next;
        C14434l c14434l = new C14434l();
        int i = c14434l.f28255l;
        if (i != 0) {
            try {
                XmlResourceParser xml = context.getResources().getXml(i);
                do {
                    next = xml.next();
                    if (next == 2) {
                        break;
                    }
                } while (next != 1);
                if (next != 2) {
                    throw new XmlPullParserException("No start tag found");
                }
                if (!TextUtils.equals(xml.getName(), "badge")) {
                    throw new XmlPullParserException("Must have a <" + ((Object) "badge") + "> start tag");
                }
                attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
                styleAttribute = attributeSetAsAttributeSet.getStyleAttribute();
            } catch (IOException | XmlPullParserException e) {
                Resources.NotFoundException notFoundException = new Resources.NotFoundException("Can't load badge resource ID #0x" + Integer.toHexString(i));
                notFoundException.initCause(e);
                throw notFoundException;
            }
        } else {
            attributeSetAsAttributeSet = null;
            styleAttribute = 0;
        }
        TypedArray typedArraySubs = AbstractC8960l.subs(context, attributeSetAsAttributeSet, AbstractC4548l.crashlytics, R.attr.badgeStyle, styleAttribute == 0 ? R.style.Widget_MaterialComponents_Badge : styleAttribute, new int[0]);
        Resources resources = context.getResources();
        this.crashlytics = typedArraySubs.getDimensionPixelSize(4, -1);
        this.subs = context.getResources().getDimensionPixelSize(R.dimen.mtrl_badge_horizontal_edge_offset);
        this.isPro = context.getResources().getDimensionPixelSize(R.dimen.mtrl_badge_text_horizontal_edge_offset);
        this.amazon = typedArraySubs.getDimensionPixelSize(14, -1);
        this.purchase = typedArraySubs.getDimension(12, resources.getDimension(R.dimen.m3_badge_size));
        this.mopub = typedArraySubs.getDimension(17, resources.getDimension(R.dimen.m3_badge_with_text_size));
        this.billing = typedArraySubs.getDimension(3, resources.getDimension(R.dimen.m3_badge_size));
        this.admob = typedArraySubs.getDimension(13, resources.getDimension(R.dimen.m3_badge_with_text_size));
        this.firebase = typedArraySubs.getInt(24, 1);
        C14434l c14434l2 = this.loadAd;
        int i2 = c14434l.f28267l;
        c14434l2.f28267l = i2 == -2 ? 255 : i2;
        int i3 = c14434l.f28269l;
        if (i3 != -2) {
            c14434l2.f28269l = i3;
        } else {
            boolean zHasValue = typedArraySubs.hasValue(23);
            C14434l c14434l3 = this.loadAd;
            if (zHasValue) {
                c14434l3.f28269l = typedArraySubs.getInt(23, 0);
            } else {
                c14434l3.f28269l = -1;
            }
        }
        String str = c14434l.f28260l;
        if (str != null) {
            this.loadAd.f28260l = str;
        } else if (typedArraySubs.hasValue(7)) {
            this.loadAd.f28260l = typedArraySubs.getString(7);
        }
        C14434l c14434l4 = this.loadAd;
        c14434l4.f28261l = c14434l.f28261l;
        CharSequence charSequence = c14434l.f28252l;
        c14434l4.f28252l = charSequence == null ? context.getString(R.string.mtrl_badge_numberless_content_description) : charSequence;
        C14434l c14434l5 = this.loadAd;
        int i4 = c14434l.f28257l;
        c14434l5.f28257l = i4 == 0 ? R.plurals.mtrl_badge_content_description : i4;
        int i5 = c14434l.f28272l;
        c14434l5.f28272l = i5 == 0 ? R.string.mtrl_exceed_max_badge_number_content_description : i5;
        Boolean bool = c14434l.f28250l;
        c14434l5.f28250l = Boolean.valueOf(bool == null || bool.booleanValue());
        C14434l c14434l6 = this.loadAd;
        int i6 = c14434l.f28266l;
        c14434l6.f28266l = i6 == -2 ? typedArraySubs.getInt(21, -2) : i6;
        C14434l c14434l7 = this.loadAd;
        int i7 = c14434l.f28246l;
        c14434l7.f28246l = i7 == -2 ? typedArraySubs.getInt(22, -2) : i7;
        C14434l c14434l8 = this.loadAd;
        Integer num = c14434l.f28262l;
        c14434l8.f28262l = Integer.valueOf(num == null ? typedArraySubs.getResourceId(5, R.style.ShapeAppearance_M3_Sys_Shape_Corner_Full) : num.intValue());
        C14434l c14434l9 = this.loadAd;
        Integer num2 = c14434l.f28268l;
        c14434l9.f28268l = Integer.valueOf(num2 == null ? typedArraySubs.getResourceId(6, 0) : num2.intValue());
        C14434l c14434l10 = this.loadAd;
        Integer num3 = c14434l.f28248l;
        c14434l10.f28248l = Integer.valueOf(num3 == null ? typedArraySubs.getResourceId(15, R.style.ShapeAppearance_M3_Sys_Shape_Corner_Full) : num3.intValue());
        C14434l c14434l11 = this.loadAd;
        Integer num4 = c14434l.f28251l;
        c14434l11.f28251l = Integer.valueOf(num4 == null ? typedArraySubs.getResourceId(16, 0) : num4.intValue());
        C14434l c14434l12 = this.loadAd;
        Integer num5 = c14434l.f28254l;
        c14434l12.f28254l = Integer.valueOf(num5 == null ? AbstractC4927l.subs(context, typedArraySubs, 1).getDefaultColor() : num5.intValue());
        C14434l c14434l13 = this.loadAd;
        Integer num6 = c14434l.f28263l;
        c14434l13.f28263l = Integer.valueOf(num6 == null ? typedArraySubs.getResourceId(8, R.style.TextAppearance_MaterialComponents_Badge) : num6.intValue());
        Integer num7 = c14434l.f28247l;
        if (num7 != null) {
            this.loadAd.f28247l = num7;
        } else {
            boolean zHasValue2 = typedArraySubs.hasValue(9);
            C14434l c14434l14 = this.loadAd;
            if (zHasValue2) {
                c14434l14.f28247l = Integer.valueOf(AbstractC4927l.subs(context, typedArraySubs, 9).getDefaultColor());
            } else {
                this.loadAd.f28247l = Integer.valueOf(new C1085l(context, c14434l14.f28263l.intValue()).isPro.getDefaultColor());
            }
        }
        C14434l c14434l15 = this.loadAd;
        Integer num8 = c14434l.f28256l;
        c14434l15.f28256l = Integer.valueOf(num8 == null ? typedArraySubs.getInt(2, 8388661) : num8.intValue());
        C14434l c14434l16 = this.loadAd;
        Integer num9 = c14434l.f28249l;
        c14434l16.f28249l = Integer.valueOf(num9 == null ? typedArraySubs.getDimensionPixelSize(11, resources.getDimensionPixelSize(R.dimen.mtrl_badge_long_text_horizontal_padding)) : num9.intValue());
        C14434l c14434l17 = this.loadAd;
        Integer num10 = c14434l.f28245l;
        c14434l17.f28245l = Integer.valueOf(num10 == null ? typedArraySubs.getDimensionPixelSize(10, resources.getDimensionPixelSize(R.dimen.m3_badge_with_text_vertical_padding)) : num10.intValue());
        C14434l c14434l18 = this.loadAd;
        Integer num11 = c14434l.f28273l;
        c14434l18.f28273l = Integer.valueOf(num11 == null ? typedArraySubs.getDimensionPixelOffset(18, 0) : num11.intValue());
        C14434l c14434l19 = this.loadAd;
        Integer num12 = c14434l.f28253l;
        c14434l19.f28253l = Integer.valueOf(num12 == null ? typedArraySubs.getDimensionPixelOffset(25, 0) : num12.intValue());
        C14434l c14434l20 = this.loadAd;
        Integer num13 = c14434l.f28259l;
        c14434l20.f28259l = Integer.valueOf(num13 == null ? typedArraySubs.getDimensionPixelOffset(19, c14434l20.f28273l.intValue()) : num13.intValue());
        C14434l c14434l21 = this.loadAd;
        Integer num14 = c14434l.f28265l;
        c14434l21.f28265l = Integer.valueOf(num14 == null ? typedArraySubs.getDimensionPixelOffset(26, c14434l21.f28253l.intValue()) : num14.intValue());
        C14434l c14434l22 = this.loadAd;
        Integer num15 = c14434l.f28264l;
        c14434l22.f28264l = Integer.valueOf(num15 == null ? typedArraySubs.getDimensionPixelOffset(20, 0) : num15.intValue());
        C14434l c14434l23 = this.loadAd;
        Integer num16 = c14434l.f28244l;
        c14434l23.f28244l = Integer.valueOf(num16 == null ? 0 : num16.intValue());
        C14434l c14434l24 = this.loadAd;
        Integer num17 = c14434l.f28258l;
        c14434l24.f28258l = Integer.valueOf(num17 == null ? 0 : num17.intValue());
        C14434l c14434l25 = this.loadAd;
        Boolean bool2 = c14434l.f28271l;
        c14434l25.f28271l = Boolean.valueOf(bool2 == null ? typedArraySubs.getBoolean(0, false) : bool2.booleanValue());
        typedArraySubs.recycle();
        Locale locale = c14434l.f28270l;
        C14434l c14434l26 = this.loadAd;
        if (locale == null) {
            c14434l26.f28270l = Build.VERSION.SDK_INT >= 24 ? Locale.getDefault(Locale.Category.FORMAT) : Locale.getDefault();
        } else {
            c14434l26.f28270l = locale;
        }
        this.yandex = c14434l;
    }
}
