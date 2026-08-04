package defpackage;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: lٌؘُ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C10912l {
    public static final Pattern crashlytics = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");
    public int yandex = -1;
    public int loadAd = -1;

    /* JADX WARN: Code duplicated, block: B:31:0x008d  */
    public final void loadAd(C7417l c7417l) {
        InterfaceC1525l interfaceC1525l;
        c7417l.getClass();
        C16971l c16971lMetrica = AbstractC1186l.metrica();
        InterfaceC1525l[] interfaceC1525lArr = c7417l.yandex;
        int length = interfaceC1525lArr.length;
        int i = 0;
        while (true) {
            InterfaceC1525l interfaceC1525l2 = null;
            if (i >= length) {
                break;
            }
            InterfaceC1525l interfaceC1525l3 = interfaceC1525lArr[i];
            if (C3514l.class.isAssignableFrom(interfaceC1525l3.getClass())) {
                InterfaceC1525l interfaceC1525l4 = (InterfaceC1525l) C3514l.class.cast(interfaceC1525l3);
                if (((C3514l) interfaceC1525l4).crashlytics.equals("iTunSMPB")) {
                    interfaceC1525l2 = interfaceC1525l4;
                }
            }
            if (interfaceC1525l2 != null) {
                c16971lMetrica.crashlytics(interfaceC1525l2);
            }
            i++;
        }
        C9258l c9258lListIterator = c16971lMetrica.mopub().listIterator(0);
        while (c9258lListIterator.hasNext()) {
            if (yandex(((C3514l) c9258lListIterator.next()).amazon)) {
                return;
            }
        }
        C16971l c16971lMetrica2 = AbstractC1186l.metrica();
        for (InterfaceC1525l interfaceC1525l5 : interfaceC1525lArr) {
            if (C18478l.class.isAssignableFrom(interfaceC1525l5.getClass())) {
                interfaceC1525l = (InterfaceC1525l) C18478l.class.cast(interfaceC1525l5);
                C18478l c18478l = (C18478l) interfaceC1525l;
                if (!(c18478l.loadAd.equals("com.apple.iTunes") && c18478l.crashlytics.equals("iTunSMPB"))) {
                    interfaceC1525l = null;
                }
            } else {
                interfaceC1525l = null;
            }
            if (interfaceC1525l != null) {
                c16971lMetrica2.crashlytics(interfaceC1525l);
            }
        }
        C9258l c9258lListIterator2 = c16971lMetrica2.mopub().listIterator(0);
        while (c9258lListIterator2.hasNext() && !yandex(((C18478l) c9258lListIterator2.next()).amazon)) {
        }
    }

    public final boolean yandex(String str) {
        Matcher matcher = crashlytics.matcher(str);
        if (!matcher.find()) {
            return false;
        }
        try {
            String strGroup = matcher.group(1);
            String str2 = AbstractC15323l.yandex;
            int i = Integer.parseInt(strGroup, 16);
            int i2 = Integer.parseInt(matcher.group(2), 16);
            if (i <= 0 && i2 <= 0) {
                return false;
            }
            this.yandex = i;
            this.loadAd = i2;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }
}
