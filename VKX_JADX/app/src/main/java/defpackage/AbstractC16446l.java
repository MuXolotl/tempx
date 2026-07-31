package defpackage;

import ealvatag.tag.datatype.AbstractDataType;
import ealvatag.tag.datatype.DataTypes;
import ealvatag.tag.id3.framebody.AbstractID3v2FrameBody;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: renamed from: lٖ٘ۘ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC16446l extends AbstractC18219l {
    private ArrayList<AbstractDataType> dataTypeList = new ArrayList<>(10);
    private HashMap<String, AbstractDataType> dataTypeMap = new HashMap<>(5);
    private AbstractC2377l header;

    public AbstractC16446l(AbstractID3v2FrameBody abstractID3v2FrameBody) {
        ArrayList<AbstractDataType> arrayList = abstractID3v2FrameBody.dataTypeList;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            AbstractDataType abstractDataType = arrayList.get(i);
            Object objNewInstance = null;
            if (abstractDataType != null) {
                try {
                    objNewInstance = abstractDataType.getClass().getConstructor(abstractDataType.getClass()).newInstance(abstractDataType);
                } catch (IllegalAccessException unused) {
                    C8339l.metrica("IllegalAccessException: No access to run constructor to create copy".concat(abstractDataType.getClass().getName()));
                    throw null;
                } catch (InstantiationException unused2) {
                    C8339l.metrica("InstantiationException: Unable to instantiate constructor to copy".concat(abstractDataType.getClass().getName()));
                    throw null;
                } catch (NoSuchMethodException unused3) {
                    C8339l.metrica("NoSuchMethodException: Error finding constructor to create copy:".concat(abstractDataType.getClass().getName()));
                    throw null;
                } catch (InvocationTargetException e) {
                    if (e.getCause() instanceof Error) {
                        throw ((Error) e.getCause());
                    }
                    if (e.getCause() instanceof RuntimeException) {
                        throw ((RuntimeException) e.getCause());
                    }
                    C8339l.metrica("InvocationTargetException: Unable to invoke constructor to create copy");
                    throw null;
                }
            }
            AbstractDataType abstractDataType2 = (AbstractDataType) objNewInstance;
            abstractDataType2.setBody(this);
            addDataType(abstractDataType2);
        }
    }

    public void addDataType(AbstractDataType abstractDataType) {
        this.dataTypeList.add(abstractDataType);
        this.dataTypeMap.put(abstractDataType.getIdentifier(), abstractDataType);
    }

    public boolean equals(Object obj) {
        if (obj instanceof AbstractC16446l) {
            return this.dataTypeList.equals(((AbstractC16446l) obj).dataTypeList);
        }
        return false;
    }

    public String getBriefDescription() {
        int size = this.dataTypeList.size();
        StringBuilder sb = new StringBuilder(PSKKeyManager.MAX_KEY_LENGTH_BYTES);
        for (int i = 0; i < size; i++) {
            AbstractDataType abstractDataType = this.dataTypeList.get(i);
            if (abstractDataType.toString() != null && abstractDataType.toString().length() > 0) {
                sb.append(abstractDataType.getIdentifier());
                sb.append("=\"");
                sb.append(abstractDataType.toString());
                sb.append("\"; ");
            }
        }
        return sb.toString();
    }

    public List<AbstractDataType> getDataTypeList() {
        return this.dataTypeList;
    }

    public AbstractC2377l getHeader() {
        return this.header;
    }

    public final String getLongDescription() {
        String string = "";
        for (AbstractDataType abstractDataType : this.dataTypeList) {
            if (abstractDataType.toString() != null && abstractDataType.toString().length() > 0) {
                StringBuilder sbAd = AbstractC5020l.ad(string);
                sbAd.append(abstractDataType.getIdentifier());
                sbAd.append(" = ");
                sbAd.append(abstractDataType.toString());
                sbAd.append("\n");
                string = sbAd.toString();
            }
        }
        return string;
    }

    public final AbstractDataType getObject(String str) {
        return this.dataTypeMap.get(str);
    }

    public final Object getObjectValue(String str) {
        return getObject(str).getValue();
    }

    public final byte getTextEncoding() {
        AbstractDataType object = getObject(DataTypes.OBJ_TEXT_ENCODING);
        if (object != null) {
            return ((Long) object.getValue()).byteValue();
        }
        return (byte) 0;
    }

    public String getUserFriendlyValue() {
        return toString();
    }

    public boolean isSubsetOf(Object obj) {
        if (!(obj instanceof AbstractC16446l)) {
            return false;
        }
        AbstractC16446l abstractC16446l = (AbstractC16446l) obj;
        int size = this.dataTypeList.size();
        for (int i = 0; i < size; i++) {
            if (!abstractC16446l.dataTypeMap.containsKey(this.dataTypeList.get(i).getIdentifier())) {
                return false;
            }
        }
        return true;
    }

    public Iterator iterator() {
        return this.dataTypeList.iterator();
    }

    public void setHeader(AbstractC2377l abstractC2377l) {
        this.header = abstractC2377l;
    }

    public final void setObjectValue(String str, Object obj) {
        AbstractDataType abstractDataType = this.dataTypeMap.get(str);
        if (abstractDataType != null) {
            abstractDataType.setValue(obj);
        }
    }

    public final void setTextEncoding(byte b) {
        setObjectValue(DataTypes.OBJ_TEXT_ENCODING, Byte.valueOf(b));
    }

    public abstract void setupObjectList();

    public String toString() {
        return getBriefDescription();
    }

    public AbstractC16446l() {
        setupObjectList();
    }
}
