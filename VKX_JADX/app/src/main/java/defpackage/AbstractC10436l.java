package defpackage;

import java.util.ArrayList;
import java.util.Set;

/* JADX INFO: renamed from: lَٝٓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC10436l {
    public static final Set yandex = AbstractC8669l.m2407import(new Character[]{'!', '#', '$', '%', '&', '\'', '*', '+', '-', '.', '^', '_', '`', '|', '~'});
    public static final Set loadAd = AbstractC8669l.m2407import(new Character[]{'-', '.', '_', '~', '+', '/'});
    public static final C11155l crashlytics = new C11155l("[a-zA-Z0-9\\-._~+/]+=*");
    public static final C11155l amazon = new C11155l("\\\\.");

    public static final int crashlytics(int i, String str) {
        while (i < str.length() && str.charAt(i) == ' ') {
            i++;
        }
        return i;
    }

    public static final Integer loadAd(ArrayList arrayList, AbstractC11393l abstractC11393l, int i, String str) {
        if (i != str.length() && str.charAt(i) != ',') {
            return null;
        }
        arrayList.add(abstractC11393l);
        if (i == str.length()) {
            return -1;
        }
        if (str.charAt(i) == ',') {
            return Integer.valueOf(i + 1);
        }
        C8339l.smaato("");
        return null;
    }

    public static final boolean yandex(char c) {
        if ('a' > c || c >= '{') {
            return ('A' <= c && c < '[') || AbstractC4654l.billing(c) || yandex.contains(Character.valueOf(c));
        }
        return true;
    }
}
