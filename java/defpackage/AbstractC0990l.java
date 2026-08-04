package defpackage;

import android.text.SpannableStringBuilder;
import java.util.List;

/* JADX INFO: renamed from: lؘِؒ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0990l {
    public static final C11155l yandex = new C11155l("\\[(\\S+?)\\|(.+?)\\]");

    public static CharSequence yandex(String str) {
        List<C0711l> listAdcel = AbstractC17587l.adcel(C11155l.yandex(yandex, str));
        if (listAdcel.isEmpty()) {
            return str;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        for (C0711l c0711l : listAdcel) {
            String str2 = (String) ((C8892l) c0711l.yandex()).get(0);
            int iM3324for = AbstractC12024l.m3324for(spannableStringBuilder, str2, 0, false, 6);
            String str3 = (String) ((C8892l) c0711l.yandex()).get(2);
            spannableStringBuilder.replace(iM3324for, Math.min(str2.length() + iM3324for, spannableStringBuilder.length()), (CharSequence) str3);
            String strConcat = (String) ((C8892l) c0711l.yandex()).get(1);
            if (!AbstractC16648l.isVip(strConcat, "https://vk.com/", false) && !AbstractC16648l.isVip(strConcat, "https://vk.ru/", false)) {
                strConcat = "https://vk.com/".concat(strConcat);
            }
            spannableStringBuilder.setSpan(new C17297l(strConcat), iM3324for, str3.length() + iM3324for, 33);
        }
        return spannableStringBuilder;
    }
}
