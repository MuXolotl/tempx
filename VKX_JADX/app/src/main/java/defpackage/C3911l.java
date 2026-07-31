package defpackage;

import ealvatag.tag.datatype.DataTypes;

/* JADX INFO: renamed from: lؖؖٛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C3911l {
    public final int yandex;

    public static String yandex(int i) {
        if (i == 0) {
            return "Unspecified";
        }
        if (i == 1) {
            return DataTypes.OBJ_TEXT;
        }
        if (i == 2) {
            return "Ascii";
        }
        if (i == 3) {
            return DataTypes.OBJ_NUMBER;
        }
        if (i == 4) {
            return "Phone";
        }
        if (i == 5) {
            return "Uri";
        }
        if (i == 6) {
            return DataTypes.OBJ_EMAIL;
        }
        if (i == 7) {
            return "Password";
        }
        if (i == 8) {
            return "NumberPassword";
        }
        if (i == 9) {
            return "Decimal";
        }
        if (i == 10) {
            return "PasswordVisible";
        }
        if (i == 11) {
            return "PostalAddress";
        }
        if (i == 12) {
            return "PersonName";
        }
        if (i == 13) {
            return "EmailSubject";
        }
        if (i == 14) {
            return "ShortMessage";
        }
        if (i == 15) {
            return "LongMessage";
        }
        if (i == 16) {
            return "Filter";
        }
        if (i == 17) {
            return "Phonetic";
        }
        if (i == 18) {
            return DataTypes.OBJ_DATETIME;
        }
        if (i == 19) {
            return "Date";
        }
        if (i == 20) {
            return "Time";
        }
        if (i == 21) {
            return "NumberSigned";
        }
        if (i == 22) {
            return "DecimalSigned";
        }
        if (i == 23) {
            return "DecimalPassword";
        }
        if (i == 24) {
            return "NumberPasswordSigned";
        }
        return i == 25 ? "DecimalPasswordSigned" : "Invalid";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C3911l) {
            return this.yandex == ((C3911l) obj).yandex;
        }
        return false;
    }

    public final int hashCode() {
        return this.yandex;
    }

    public final String toString() {
        return yandex(this.yandex);
    }
}
