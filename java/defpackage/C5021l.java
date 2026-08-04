package defpackage;

import ealvatag.tag.id3.framebody.FrameBodyTDAT;
import java.io.UnsupportedEncodingException;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: renamed from: lٜؗٝ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C5021l implements InterfaceC7988l {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final LinkedHashSet f10251l = new LinkedHashSet();

    @Override // defpackage.InterfaceC7988l
    public final String admob() {
        StringBuilder sb = new StringBuilder();
        Iterator it = this.f10251l.iterator();
        sb.append(((AbstractC0231l) it.next()).f5140l.getUserFriendlyValue());
        AbstractC0231l abstractC0231l = (AbstractC0231l) it.next();
        if (abstractC0231l.f5140l.getUserFriendlyValue().length() == 4) {
            sb.append("-");
            sb.append(abstractC0231l.f5140l.getUserFriendlyValue().substring(2, 4));
            if (!((FrameBodyTDAT) abstractC0231l.f5140l).isMonthOnly()) {
                sb.append("-");
                sb.append(abstractC0231l.f5140l.getUserFriendlyValue().substring(0, 2));
            }
        }
        return sb.toString();
    }

    @Override // defpackage.InterfaceC4656l
    public final byte[] billing() throws UnsupportedEncodingException {
        throw new UnsupportedEncodingException();
    }

    @Override // defpackage.InterfaceC4656l
    public final String getId() {
        StringBuilder sb = new StringBuilder();
        Iterator it = this.f10251l.iterator();
        while (it.hasNext()) {
            sb.append(((AbstractC0231l) it.next()).f1216l);
        }
        return sb.toString();
    }

    @Override // defpackage.InterfaceC4656l
    public final boolean isEmpty() {
        return false;
    }

    @Override // defpackage.InterfaceC4656l
    public final boolean startapp() {
        return true;
    }

    public final void yandex(AbstractC0231l abstractC0231l) {
        this.f10251l.add(abstractC0231l);
    }
}
